import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the row number: ");
		int row = scanner.nextInt();
		
		System.out.print("Enter the column number: ");
		int col = scanner.nextInt();
		
		if ((0 < row) && (0 < col)) {
		
			System.out.println(" \n"
					+ "========================\n"
					+ " ");
		
			int[][] matrix = new int [row][col];
			int[][] matrixTranspose = new int [col][row];
		
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print("Enter " + (i + 1) + ".row " + (j + 1) + ".column: ");
					matrix[i][j] = scanner.nextInt();
				}
			}
	
			for (int i = 0; i < matrix.length; i++){
				for (int j = 0; j < matrix[i].length; j++){
					matrixTranspose[j][i] = matrix[i][j];
				}
			}
		
			System.out.println(" \n"
					+ "========================\n"
					+ " ");
		
			System.out.println("Matrix Transpose: ");

			for (int i = 0; i < matrixTranspose.length; i++){
				for (int j = 0; j < matrixTranspose[i].length; j++){
					System.out.print(matrixTranspose[i][j] + " ");
				}
				System.out.println();
			}
			} else {
				System.out.println("Invalid number");
			}
		}
	
}
