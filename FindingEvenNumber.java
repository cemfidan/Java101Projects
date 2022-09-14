import java.util.Scanner;

public class FindingEvenNumber {
	public static void main(String[] args) {
		int number,i=0;
		int total=0;
		double avarage=0;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		while(i<number) {
			if ((i%3==0) || (i%4==0)) {
				total++;
				avarage+=i;
				i++;
			}
		}
		System.out.println(avarage/total);
	}
}
