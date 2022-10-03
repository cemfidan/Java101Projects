import java.util.Scanner;

public class PrimeNumRecursive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int prime = scanner.nextInt();
		scanner.close();
		
		if (isPrime(prime, 2)) {
			System.out.println(prime + " is prime.");
		} else {
			System.out.println(prime + " is not prime.");
		}

	}

	public static boolean isPrime(int n, int i) {
		if (n <= 2) {
			if (n == 2) {
				return true;
			} else {
				return false;
			}
		}
		
		if (n % i == 0) {
			return false;
		}
		
		if (i * i > n) {
			return true;
		}

		return isPrime(n, i + 1);
	}

}
