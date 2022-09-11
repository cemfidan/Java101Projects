import java.util.Scanner;

public class ClassStatus {
	public static void main(String[] args) {
		double mathScore, physicScore, turkishScore, chemScore, musicScore, avarage;
		double total = 0;
		double classNumber = 0;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Math Score: ");
		mathScore = inp.nextInt();
		if (mathScore<0 || mathScore>100) {
			System.out.println("Enter a value from 0-100");
		}else {
			total+=mathScore;
			classNumber++;
		}
		
		System.out.print("Physics Score: ");
		physicScore = inp.nextInt();
		if (physicScore<0 || physicScore>100) {
			System.out.println("Enter a value from 0-100");
		}else {
			total+=physicScore;
			classNumber++;
		}
		
		System.out.print("Turkish Score: ");
		turkishScore = inp.nextInt();
		if (turkishScore<0 || turkishScore>100) {
			System.out.println("Enter a value from 0-100");
		}else {
			total+=turkishScore;
			classNumber++;
		}
		
		System.out.print("Chemistry Score: ");
		chemScore = inp.nextInt();
		if (chemScore<0 || chemScore>100) {
			System.out.println("Enter a value from 0-100");
		}else {
			total+=chemScore;
			classNumber++;
		}
		
		System.out.print("Music Score: ");
		musicScore = inp.nextInt();
		if (musicScore<0 || musicScore>100) {
			System.out.println("Enter a value from 0-100");
		}else {
			total+=musicScore;
			classNumber++;
		}
		
		avarage = total / classNumber;
		
		if (avarage>=55) {
			System.out.println("Congrats, you passed. Your avarage: " + avarage);
		}else {
			System.out.println("You could not pass, maybe next time. Your avarage: " + avarage);
		}
	}
}
