import java.util.Scanner;

public class AdvancedCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String menu = "1- Addition\n" + "2- Subtraction\n" + "3- Multiplication\n" + "4- Division\n"
				+ "5- Exponential Number\n" + "6- Factorial\n" + "7- Modulo\r\n"
				+ "8- Perimeter and Area of Rectangle\n" + "0- Exit";

		System.out.println("Welcome to the Advanced Calculator!\n" + menu);

		System.out.println(menu);
		System.out.print("The action you want to do: ");
		int select = scan.nextInt();

		switch (select) {
		case 0:
			break;
		case 1:
			Addition();
			break;
		case 2:
			Subtraction();
			break;
		case 3:
			Multiplication();
			break;
		case 4:
			Division();
			break;
		case 5:
			ExponentialNumber();
			break;
		case 6:
			Factorial();
			break;
		case 7:
			Modulo();
			break;
		case 8:
			RectanglePerimeterArea();
			break;
		default:
			System.out.println("Invalid number. Try again.");
		}

	}

	static void Addition() {
		Scanner scan = new Scanner(System.in);
		int number, result = 0, i = 1;
		while (true) {
			System.out.print(i++ + ". number: ");
			number = scan.nextInt();
			if (number == 0) {
				break;
			}
			result += number;
		}
		System.out.println("Result: " + result);
	}

	static void Subtraction() {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers will you enter?: ");
		int counter = scan.nextInt();
		int number, result = 0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". number: ");
			number = scan.nextInt();
			if (i == 1) {
				result += number;
				continue;
			}
			result -= number;
		}

		System.out.println("Result: " + result);
	}

	static void Multiplication() {
		Scanner scan = new Scanner(System.in);
		int number, result = 1, i = 1;

		while (true) {
			System.out.print(i++ + ". number: ");
			number = scan.nextInt();

			if (number == 1)
				break;

			if (number == 0) {
				result = 0;
				break;
			}
			result *= number;
		}

		System.out.println("Result: " + result);
	}

	static void Division() {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers will you enter?: ");
		int counter = scan.nextInt();
		double number, result = 0.0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". number: ");
			number = scan.nextDouble();
			if (i != 1 && number == 0) {
				System.out.println("You can not enter the divisor 0.");
				continue;
			}
			if (i == 1) {
				result = number;
				continue;
			}
			result /= number;
		}

		System.out.println("Result: " + result);
	}

	static void ExponentialNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the base: ");
		int base = scan.nextInt();
		System.out.print("Enter the exponent: ");
		int exponent = scan.nextInt();
		int result = 1;

		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}

		System.out.println("Result: " + result);
	}

	static void Factorial() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scan.nextInt();
		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		System.out.println("Result: " + result);
	}

	static void Modulo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scan.nextInt();
		System.out.print("Enter the mod: ");
		int m = scan.nextInt();
		int result = n % m;
		System.out.println("Result: " + result);
	}

	static void RectanglePerimeterArea() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first side: ");
		int n1 = scan.nextInt();
		System.out.print("Enter the second side: ");
		int n2 = scan.nextInt();

		int perimeter = (n1 + n2) * 2;
		int area = n1 * n2;

		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
	}

}
