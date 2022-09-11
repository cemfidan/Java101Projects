import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		System.out.print("Enter the year: ");
		Scanner inp = new Scanner(System.in);
		year = inp.nextInt();
		
		if ((year%4==0) && (year%100!=0) || (year%400==0)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}
}
