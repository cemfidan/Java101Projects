import java.util.Scanner;

public class ExponentialNumber {
	public static void main(String[] args) {
		int number, exponential;
		int total = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Base number: ");
		number = input.nextInt();
		System.out.print("Exponential number: ");
		exponential = input.nextInt();
		
		for (int i = 1; i <= exponential; i++) {
			total *= number;
		}
		System.out.println("Result: " + total);
		input.close();
	}
}
