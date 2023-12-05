import java.util.Scanner;

public class KDVTutarıHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double kdv, kFiyat, ksizFiyat,fiyat;
		System.out.print("Para değerini giriniz: ");
		fiyat = input.nextInt();
		
		if(fiyat<1000) {
			kdv = fiyat * 0.18 ;
			System.out.println("KDV'siz fiyat: " + fiyat);
			System.out.println("KDV'li fiyat: " + (fiyat +kdv));
			System.out.println("KDV tutarı: " + kdv);
		}
		
		else {
			kdv = fiyat * 0.08;
			System.out.println("KDV'siz fiyat: " + fiyat);
			System.out.println("KDV'li fiyat: " + (fiyat +kdv));
			System.out.println("KDV tutarı: " + kdv);			
		}

	}

}
