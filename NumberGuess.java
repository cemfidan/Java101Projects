import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		
		int right = 5;
		
		Random random = new Random();
		int number = random.nextInt(100);
		
		Scanner scanner = new Scanner(System.in);
		
		while (0 < right) {
			System.out.print("Enter your guess: ");
			int choice = scanner.nextInt();
			
			if ((choice < 0) || (99 < choice)) {
				System.out.print("Invalid number. Please enter a value between 0-100.");
			}
			
			if (choice == number) {
				System.out.println("Correct! The number you guessed is: " + choice);
				break;
			} else {
				if (choice < number) {
					System.out.println(choice + " is less than the number.");
				} else {
					System.out.println(choice + " is greater than the number.");
				}
				
				right--;
				System.out.println("Right: " + (right));
			}
			
			System.out.println("------------------------");
			System.out.println(" ");
			
			if (right == 0) {
				System.out.println("The END");
			}
		}
		scanner.close();
	}
}
