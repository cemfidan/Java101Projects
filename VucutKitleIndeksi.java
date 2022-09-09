/*
 Java ile kullanıcıdan boy ve kilo 
 değerlerini alıp bir değişkene atayın. 
 Aşağıdaki formüle göre kullanıcının 
 "Vücut Kitle İndeks" değerini hesaplayıp 
 ekrana yazdırın.
 
 Formül
 Kilo (kg) / Boy(m) * Boy(m)
 */

import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		double kilo, boy;
		
		Scanner girdi = new Scanner(System.in);
		System.out.print("Kilonuzu kilogram cinsinden yazınız: ");
		kilo = girdi.nextDouble();
		
		System.out.print("Boyunuzu metre cinsinden yazınız: ");
		boy = girdi.nextDouble();
		
		double vki = kilo / (boy * boy);
		
		System.out.println("Vücut Kitle İndeksiniz: " + vki);
	}
}
