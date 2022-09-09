import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {
		
		Scanner girdi = new Scanner(System.in);
		System.out.print("Lütfen tutar giriniz: ");
		double tutar = girdi.nextDouble();
		double durum = (tutar < 1000) ? (tutar * 1.18) : (tutar * 1.08);
		System.out.println("KDV'siz Fiyat: " + tutar + " TL" + "\nKDV'li Fiyat: " + durum + " TL");
	}

}
