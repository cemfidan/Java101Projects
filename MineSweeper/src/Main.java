import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Mine Sweeper!");
		
		System.out.print("Enter the Board-Row: ");
		int row = scanner.nextInt();
		
		System.out.print("Enter the Board-Column: ");
		int col = scanner.nextInt();
		
		MineSweeper mine = new MineSweeper(row, col);
		
		mine.run();

		scanner.close();
	}

}
