/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre 
taksimetre tutarını ekrana yazdıran 
programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL 
altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/

import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		
		double mesafe, tutar, fiyat;
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("Gidilen mesafeyi kilometre cinsinden giriniz: ");
		mesafe = girdi.nextDouble();
		
		fiyat = (mesafe * (2.20)) + 10;
		
		tutar = (fiyat > 20) ? fiyat : 20;
		System.out.print("Gidilen mesafe: " + mesafe + "\nÖdenecek Tutar: " + tutar);
	}
}
