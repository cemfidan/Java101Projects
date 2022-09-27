import java.util.Arrays;
import java. util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number of elements: ");
		int series = scanner.nextInt();
		
		int[] list = new int [series];
		
		for (int i = 0; i < series; i++) {
			System.out.print((i+1) + ". Element: ");
			int number = scanner.nextInt();
			list[i] = number;
		}
		
		Arrays.sort(list);
		
		System.out.print("Array: " + Arrays.toString(list));
		
		scanner.close();
	}

}
