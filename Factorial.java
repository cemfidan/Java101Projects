import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int nNumber, rNumber, diff, nFact = 1, rFact = 1, diffFact = 1;
		int combination = nFact / (rFact * diffFact);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the set: ");
		nNumber = input.nextInt();
		
		System.out.print("Enter the number of selections: ");
		rNumber = input.nextInt();		
		
		for (int i = 1; i <= nNumber; i++) {
			nFact *= i;
		}
		for (int i = 1; i <= rNumber; i++) {
			rFact *= i;
		}
		for (int i = 1; i <= diff; i++) {
			diffFact *= i;
		}
		
		System.out.println(combination);
	}
}
