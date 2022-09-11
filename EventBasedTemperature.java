import java.util.Scanner;

public class EventBasedTemperature {
	public static void main(String[] args) {
		double temp;
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the Temperature: ");
		temp = inp.nextDouble();
		
		if(temp<5) {
			System.out.println("Suggesting Event: Ski");
		}else if(temp>=5&&temp<15) {
			System.out.println("Suggesting Event: Cinema");
		}else if(temp>=15&&temp<25) {
			System.out.println("Suggesting Event: Picnic");
		}else if(temp>=25) {
			System.out.println("Suggesting Event: Swim");
		}
	}
}
