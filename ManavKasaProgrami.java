/*
 Java ile kullanıcıların manavdan 
 almış oldukları ürünlerin kilogram 
 değerlerine göre toplam tutarını 
 ekrana yazdıran programı yazın.

 Meyveler ve KG Fiyatları

 Armut : 2,14 TL
 Elma : 3,67 TL
 Domates : 1,11 TL
 Muz: 0,95 TL
 Patlıcan : 5,00 TL
*/

import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {
		
		double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo, toplamFiyat;
		double armutFiyat = 2.14;
		double elmaFiyat = 3.67;
		double domatesFiyat = 1.11;
		double muzFiyat = 0.95;
		double patlicanFiyat = 5.0;
		
		Scanner girdi = new Scanner(System.in);
		System.out.print("Aldığınız armut kilo miktarı: ");
		armutKilo = girdi.nextDouble();
		
		System.out.print("Aldığınız elma kilo miktarı: ");
		elmaKilo = girdi.nextDouble();

		System.out.print("Aldığınız domates kilo miktarı: ");
		domatesKilo = girdi.nextDouble();

		System.out.print("Aldığınız muz kilo miktarı: ");
		muzKilo = girdi.nextDouble();

		System.out.print("Aldığınız patlıcan kilo miktarı: ");
		patlicanKilo = girdi.nextDouble();
		
		toplamFiyat = (armutFiyat*armutKilo) +
					  (elmaFiyat*elmaKilo) +
					  (domatesFiyat*domatesKilo) +
					  (muzFiyat*muzKilo) +
					  (patlicanFiyat*patlicanKilo);
		
		System.out.print("Toplam Tutar: " + toplamFiyat + " TL");
		
		
	}
}
