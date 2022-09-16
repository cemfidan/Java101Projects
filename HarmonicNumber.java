import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		double result = 0;
		
		for(double i = 1; i <= number; i++) {
			result += (1/i);
		}
		System.out.print("Result: " + result);
	}
}
