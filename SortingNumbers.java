import java.util.Scanner;

public class SortingNumbers {
	public static void main(String[] args) {
		double n1, n2,n3;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		n1 = inp.nextDouble();
		System.out.print("Enter the second number: ");
		n2 = inp.nextDouble();
		System.out.print("Enter the third number: ");
		n3 = inp.nextDouble();
		
		if ((n1<n2) && (n1<n3)){
			if(n2<n3) {
				System.out.print("n1 < n2 < n3");
			}else{
				System.out.print("n1 < n3 < n2");
			}
		} else if ((n2<n1) && (n2<n3)){
			if(n1<n3) {
				System.out.print("n2 < n1 < n3");
			}else{
				System.out.print("n2 < n3 < n1");
			}
		} else if ((n3<n1) && (n3<n2)){
			if(n1<n2) {
				System.out.print("n3 < n1 < n2");
			}else{
				System.out.print("n3 < n2 < n1");
			}
		} else if(n1==n2) {
			if(n1<n3) {
				System.out.println("n1 = n2 < n3");
			}else{
				System.out.println("n3 < n1 = n2");
			}
		}else if(n1==n3) {
			if(n1<n2) {
				System.out.println("n1 = n3 < n2");
			}else{
				System.out.println("n2 < n1 = n3");
			}
		}else if(n2==n3) {
			if(n1<n2) {
				System.out.println("n1 < n2 = n3");
			}else{
				System.out.println("n2 = n3 < n1");
			}
		}
	}
}
