import java.util.Scanner;  

public class DiamondShape {

	public static void main(String[] args) {
		int n, m = 1;
		
		Scanner scanner = new Scanner(System.in);  
		
		System.out.print("Enter the number: ");  
		int number = scanner.nextInt();
		
		while (m <= number) {
			n = 1;
			while (n++ <= number - m) {
				System.out.print(" ");
			}
			n = 1;
			while (n++ <= m * 2 - 1) {
				System.out.print("*");
			}
			System.out.println();
			m++;
		}
		
		m = number - 1;
		
		while (m > 0) {
			n = 1;
			while (n++ <= number - m) {
				System.out.print(" ");
			}
			n = 1;
			while (n++ <= m * 2 - 1) {
				System.out.print("*");
			}
			System.out.println();
			m--;
		}
	}
}
