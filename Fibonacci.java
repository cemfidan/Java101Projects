import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int number1 = 0, number2 = 1, number3;
		
		System.out.print("Enter the number of elements: ");
		int numberTotal = scanner.nextInt();
		System.out.print("Fibonacci Series: " + number1 + " " + number2 + " ");
		
		for (int i = 2; i <= numberTotal; i++) {
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
			System.out.print(number3 + " ");
		}
	}
}
