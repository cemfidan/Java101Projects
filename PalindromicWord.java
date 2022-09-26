import java.util.Scanner;

public class PalindromicWord {

	static boolean isPalindrome(String str) {
		
		int firstLetter = 0;
		int lastLetter = str.length() - 1;
		
		while (firstLetter < lastLetter) {
			if (str.charAt(firstLetter) != str.charAt(lastLetter)) {
				return false;
			}
			firstLetter++;
			lastLetter++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the word: ");
		String word = scanner.nextLine();
		
		System.out.println("Your word " + word + " is Palindromic word?: "  + isPalindrome(word));
		scanner.close();
	}

}
