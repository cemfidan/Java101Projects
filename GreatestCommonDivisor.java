import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		int ebob = 1;
		
		System.out.print("Enter the first number: ");
		int numberFirst = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int numberSecond = scanner.nextInt();
		
		while (i<=numberFirst) {
			if ((numberFirst%i==0) && (numberSecond%i==0)) {
				ebob = i;
			}
			i++;
		}
		System.out.println("Greatest Common Divisor: " + ebob);
		
		int ekok = ((numberFirst * numberSecond) / i);
		System.out.println("Lesser Common Divisor: " + ekok);
		}
	}

