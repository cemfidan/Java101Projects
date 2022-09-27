import java.util.Scanner;

public class HarmonicAverage {
	
	public static void main(String[] args) {
		
		double sum = 0;	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Number of elements of the array: ");
		int numberElement = scanner.nextInt();
		
		for(double i = 1; i <= numberElement; i++)
		{
			sum = sum + (1 / i);
		}
		System.out.println("Harmonic Average: " + sum);
		
		scanner.close();

	}

}
