import java.util.Scanner;
import java.util.*;

public class HoroscopeFinder {
	public static void main(String[] args) {
		int day, month;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter the day you were born(with number): ");
		day = inp.nextInt();
		System.out.print("Enter the month you were born(with number): ");
		month = inp.nextInt();
		
		if(month==1) {
			if((day<=21) && (0<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Capricorn");
			}else if ((day<=31) && (21<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Aquarius");
			}else {
				System.out.print("Invalid number!");
			}
		}else if (month==2) {
			if((day<=19) && (0<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Aquarius");
			}else if ((day<=29) && (19<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Pisces");
			}else {
				System.out.print("Invalid number!");
			}
		}else if (month==3) {
			if((day<=21) && (0<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Pisces");
			}else if ((day<=31) && (21<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Aries");
			}else {
				System.out.print("Invalid number!");
			}
		}else if (month==4) {
			if((day<=20) && (0<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Aries");
			}else if ((day<=30) && (20<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Taurus");
			}else {
				System.out.print("Invalid number!");
			}
		}else if (month==5) {
			if((day<=21) && (0<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Taurus");
			}else if ((day<=31) && (21<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Gemini");
			}else {
				System.out.print("Invalid number!");
			}
		}else if (month==6) {
			if((day<=22) && (0<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Gemini");
			}else if ((day<=30) && (22<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Cancer");
			}else {
				System.out.print("Invalid number!");
			}
		}else if (month==7) {
			if((day<=22) && (0<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Cancer");
			}else if ((day<=31) && (22<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Leo");
			}else {
				System.out.print("Invalid number!");
			}
		}else if (month==8) {
			if((day<=22) && (0<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Leo");
			}else if ((day<=31) && (22<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Virgo");
			}else {
				System.out.print("Invalid number!");
			}
		}else if (month==9) {
			if((day<=22) && (0<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Virgo");
			}else if ((day<=30) && (22<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Libra");
			}else {
				System.out.print("Invalid number!");
			}
		}else if (month==10) {
			if((day<=22) && (0<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Libra");
			}else if ((day<=31) && (22<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Scorpio");
			}else {
				System.out.print("Invalid number!");
			}
		}else if (month==11) {
			if((day<=21) && (0<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Scorpio");
			}else if ((day<=30) && (21<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Sagittarius");
			}else {
				System.out.print("Invalid number!");
			}
		}else if (month==12) {
			if((day<=21) && (0<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Sagittarius");
			}else if ((day<=31) && (21<day)) {
				System.out.print("Day: " + (day) + " Month: " + (month)
						+ "\nHoroscope: Capricorn");
			}else {
				System.out.print("Invalid number!");
			}
		}else {
			System.out.print("Invalid number!");
		}
	}
}


