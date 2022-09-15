import java.util.Scanner;

public class FindingExponents {
	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		number = input.nextInt();
		for (int i = 1; i < number; i*=4) {
			System.out.println("Multiples of 4: " + i);
		}
		for (int i = 1; i < number; i*=5) {
			System.out.println("Multiples of 5: " + i);
		}
	}
}
