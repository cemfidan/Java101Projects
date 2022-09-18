import java.util.Scanner;  

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number, digit, sum = 0;  
		
		Scanner scanner = new Scanner(System.in);  
		
		System.out.print("Enter the number: ");  
		number = scanner.nextInt();
		
		while(number > 0)  {  
			digit = number % 10;    
			sum += digit;   
			number = number / 10;  
		}  
		
		System.out.println("Sum of Digits: " + sum);  
	}
}
