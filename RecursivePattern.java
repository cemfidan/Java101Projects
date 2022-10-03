import java.util.Scanner;

public class RecursivePattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of pattern: ");
		int pattern = scanner.nextInt();

		scanner.close();
		
		System.out.print("Result: ");
		
		Pattern(pattern);
	}
	
	public static void Pattern(int pattern) {
		
		System.out.print(pattern + " ");;
		
		if (0 < pattern) {
			Pattern(pattern - 5);
			System.out.print(pattern + " ");
		} 
	}

}
