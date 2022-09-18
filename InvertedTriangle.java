import java.util.Scanner;  

public class InvertedTriangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);  
		
		System.out.print("Enter the number: ");  
		int number = scanner.nextInt();
 
		int i = number, j;
        
        while (i > 0) {
            j = 0;
            while (j++ < number - i) {
                System.out.print(" ");
            }
            j = 0;
            while (j++ < (i * 2) - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
	}
}
