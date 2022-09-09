import java.util.Scanner;

public class NotOrtalamasi {
	
	public static void main(String[] args) {
		
		int mat, fizik, kimya, turkce, tarih, muzik;
		
		Scanner ort = new Scanner(System.in);
		
		System.out.print("Matematik notunuzu giriniz: ");
		mat = ort.nextInt();		
		
		System.out.print("Fizik notunuzu giriniz: ");
		fizik = ort.nextInt();	
		
		System.out.print("Kimya notunuzu giriniz: ");
		kimya = ort.nextInt();
		
		System.out.print("Türkçe notunuzu giriniz: ");
		turkce = ort.nextInt();
		
		System.out.print("Tarih notunuzu giriniz: ");
		tarih = ort.nextInt();
		
		System.out.print("Müzik notunuzu giriniz: ");
		muzik = ort.nextInt();
		
		double sonuc = (mat+fizik+kimya+turkce+tarih+muzik)/6;
		String durum = (sonuc > 60) ? "Sınıfı geçtiniz!" : "Sınıfta Kaldınız!";
		System.out.println("Ortalamanız: " + sonuc + "\nGeçme Durumunuz: " + durum);

	}

}
