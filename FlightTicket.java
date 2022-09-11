import java.util.Scanner;

public class FlightTicket {
	public static void main(String[] args) {
		int distance, age, tripType;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter your distance(with km): ");
		distance = inp.nextInt();
		System.out.print("Enter your age: ");
		age = inp.nextInt();
		System.out.print("Trip type:\n1-One way\n2-Round trip"
				       + "\nEnter your trip type: ");
		tripType = inp.nextInt();
		
		double feeDistance = (distance * 0.1);
		double feeMinor = feeDistance * 0.5;
		double feeTeen = feeDistance * 0.9;
		double feeAdult = feeDistance;
		double feeElder = feeDistance * 0.7;
		
		if ((0<distance) || (0<age) || (0<tripType) || (tripType<3)) {
			if(age<12) {
				if(tripType==1) {
					System.out.println("Price: " + feeMinor + " TL");
				}else {
					System.out.println("Price: " + (feeMinor*1.6) + " TL");
				}
				}
				else if ((12<=age) && (age<=24)) {
					if(tripType==1) {
						System.out.println("Price: " + feeTeen + " TL");
					}else {
						System.out.println("Price: " + (feeTeen*1.6) + " TL");
					}
				} else if ((24<age) && (age<=65)) {
					if(tripType==1) {
						System.out.println("Price: " + feeAdult + " TL");
					}else {
						System.out.println("Price: " + (feeAdult*1.6) + " TL");
					}
				} else if (65<age) {
					if(tripType==1) {
						System.out.println("Price: " + feeElder + " TL");
					}else {
						System.out.println("Price: " + (feeElder*1.6) + " TL");
					}
				}
			}else {
				System.out.println("Invalid number!");
			}
		}
	}

