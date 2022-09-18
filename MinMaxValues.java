import java.util.Scanner;

public class MinMaxValues {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many numbers will you enter?: ");
		int numberBase = scanner.nextInt();
		
		int i = 1;
		int max = 0;
		int min = 0;
		
		while (i <= numberBase) {
			System.out.print("Enter the number-" + i + ": ");
			int number = scanner.nextInt();
			i++;
			
			if (max <= number ) {
				max = number;
			} else if (number <= min) {
				min = number;
			}
		}
		System.out.println("Largest number: " + max); 
		System.out.println("Smallest number: " + min);
	}
}