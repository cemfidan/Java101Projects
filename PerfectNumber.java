import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		
		System.out.print("Welcome to the perfect number program\n"
				+ "Enter the number: ");
		int number = scanner.nextInt();
		
		for (int i = 1; i < number; i++) {
			if (number % i ==0) {
				total += i;
			}
		}
		
		if (number == total) {
			System.out.println(number + " is the perfect number.");
		} else {
			System.out.println(number + " is not the perfect number.");
		}
		
	}
}
