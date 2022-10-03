import java.util.Scanner;

public class RecursiveExponential {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the base number: ");
		int base = scanner.nextInt();

		System.out.print("Enter the exponent: ");
		int exponent = scanner.nextInt();

		scanner.close();

		System.out.println("Result: " + Exponent(base, exponent));
	}

	public static int Exponent(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		} else {
			return base * Exponent(base, exponent - 1);
		}
	}
}
