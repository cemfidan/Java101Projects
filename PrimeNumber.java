public class PrimeNumber {

	public static void main(String[] args) {
		boolean isPrime;
		System.out.print("Prime Numbers from 1 to 100: ");
		for(int i = 2; i <= 100; i++) {
			isPrime = true;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
		}
		
	}
}
