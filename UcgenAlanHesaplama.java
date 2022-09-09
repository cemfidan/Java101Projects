import java.util.Scanner;

public class UcgenAlanHesaplama {

	public static void main(String[] args) {
		
		double kenar1, kenar2, kenar3, ucgenU, ucgenAlan;
		Scanner girdi = new Scanner(System.in);
		
		System.out.print("1.Kenarı Giriniz: ");
		kenar1 = girdi.nextDouble();

		System.out.print("2.Kenarı Giriniz: ");
		kenar2 = girdi.nextDouble();

		System.out.print("3.Kenarı Giriniz: ");
		kenar3 = girdi.nextDouble();
		
		ucgenU = (kenar1 + kenar2 + kenar3)/2;
		
		ucgenAlan = Math.sqrt(ucgenU * (ucgenU-kenar1) * (ucgenU-kenar2) * (ucgenU-kenar3));
				
		System.out.println("Girdiğiniz üçgen kenar değerleri: " + kenar1 + " " + kenar2 + " " + kenar3 + " " );
		System.out.println("Üçgen alanı: " + ucgenAlan);
	}
}
