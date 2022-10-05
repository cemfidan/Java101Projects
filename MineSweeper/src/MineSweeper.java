import java.util.Scanner;

public class MineSweeper {
    int rowBoard;
    int colBoard;
    int boardSize = rowBoard * colBoard;

    public MineSweeper(int rowBoard, int colBoard) {
    	this.rowBoard = rowBoard;
    	this.colBoard = colBoard;
    }

    public void mine(String [][][] arr) {
        int mineNumber = boardSize / 4;
        while (mineNumber > 0){
            int location = (int) (Math.random() * boardSize);
            int row = location / colBoard;
            int col = location % colBoard;
            if (row < rowBoard && col < colBoard){
                arr[row][col][0] = "*";
                arr[row][col][1] = "0";
                mineNumber--;
            }
        }
    }

    public int control(int row, int col, String[][][] arr) {
        int sum = 0;
        for(int i = - 1; i < 2; i++) {
            for(int j = - 1; j < 2; j++) {
                if (row + i < 0 || col + j < 0) {
                	continue;
                }
                if (row + i >= rowBoard || col + j >= colBoard) {
                	continue;
                }
                if (i == 0 && j == 0) {
                	continue;
                }
                if (arr[row + i][col + j][0] == "*") {
                	sum++;
                }
            }
        }
        return sum;
    }

    public void placeNumber(String[][][] _arr) {
        for(int i = 0; i < rowBoard; i++){
            for(int j = 0;j < colBoard; j++){
                if( _arr[i][j][0] == null) {
                    _arr[i][j][0] = String.valueOf(control(i, j, _arr));
                    _arr[i][j][1] = "0";
                }
            }
        }
    }

    public void printField(String[][][] _arr) {
        for(int i = 0;  i < rowBoard; i++) {
            for (int j = 0; j < colBoard; j++) {
                if (_arr[i][j][1] == "0") {
                    System.out.print("- ");
                } else {
                    System.out.print(_arr[i][j][0] + " ");
                }
            }
            System.out.print("\n");
        }
    }

    public void dataEntry(int x, int y , String[][][] arr) {
        arr[x][y][1]="1";
    }


    public void run() {

        String[][][] arr = new String[rowBoard][colBoard][2];

        Scanner scanner = new Scanner(System.in);
        mine(arr);
        placeNumber(arr);
        int entrance = 0;
        int row;
        int col;
        while(rowBoard * colBoard - entrance>(int)(colBoard * rowBoard / 4)) {
            printField(arr);
            System.out.print("Row: ");
            row = scanner.nextInt();
            System.out.print("Column: ");
            col = scanner.nextInt();
            if (arr[row][col][0].equals("*")) {
                dataEntry(row,col,arr);
                printField(arr);
                System.out.println("G A M E  O V E R");
                break;
            } else {
                dataEntry(row, col, arr);
            }
            System.out.println("-----------------------------------------------------------");
        }
        scanner.close();
    }
}