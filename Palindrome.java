import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		System.out.println("Is " + number + " Palindrome Number?: " + isPalindrom(number));

	}
	
	static boolean isPalindrom(int number) {
		int temp = number, reverseNumber = 0, lastDigit;
		while (temp != 0) {
			lastDigit = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastDigit;
			temp /= 10;
		}
		if (number == reverseNumber) {
			return true;
		} else {
			return false;
		}
	}
}
