import java.util.Scanner;
import java.util.Arrays;

public class CloseNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
		
		int min = list[0];
		int max = list[0];
		
		System.out.println("Array: " + Arrays.toString(list));
		
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		
		scanner.close();
		
		Arrays.sort(list);
		
		for (int i = list.length - 1; 0 < i; i--) {
			if (list[i] < min) {
				min = list[i];
				break;
			}
		}
		
		for (int i = 0; i < list.length; i++) {
			if (max < list[i]) {
				max = list[i];
				break;
			}
		}
		
		 if (number < min) {
			System.out.println("The nearest number smaller than the entered number: " + min);
		 }
		 if (number > max) {
			System.out.println("The nearest number greater than the entered number: " + max);
		 }
	}
}
