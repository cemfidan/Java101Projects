/*
 Yarıçapı r, merkez açısının ölçüsü 
 𝛼 olan daire diliminin alanı bulan 
 programı yazınız.

 𝜋 sayısını = 3.14 alınız.

 Formül : (𝜋 * (r*r) * 𝛼) / 360
*/

import java.util.Scanner;

public class DaireHesaplama {

	public static void main(String[] args) {
		double yaricap, daireAlan;
		double piSayisi = 3.14;
		int merkezAci;
		
		
		Scanner girdi = new Scanner(System.in);
		System.out.print("Dairenin yarıçapını giriniz: ");
		yaricap = girdi.nextDouble();
		System.out.print("Merkez açı ölçüsünü giriniz: ");
		merkezAci = girdi.nextInt();
		
		daireAlan = (piSayisi * (yaricap*yaricap) * merkezAci) / 360;
		
		System.out.print("Yarıçapı " + yaricap + 
				" ve merkez açısı " + merkezAci + 
				" olan dairenin alanı: " + daireAlan);
	}
}
