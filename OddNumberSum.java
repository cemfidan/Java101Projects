import java.util.Scanner;

public class OddNumberSum {
	public static void main(String[] args) {
		int number = 0,total=0;
		Scanner input = new Scanner(System.in);
		while((number%2==0)||(number%4==0)) {
			System.out.print("Please enter the number: ");
			number = input.nextInt();
			if((number%4!=0)||(number==2)) {
				continue;
			}else {
				total+=number;
			}
		}
		System.out.println("Sum of even and divisible numbers: " + total);
	}
}
