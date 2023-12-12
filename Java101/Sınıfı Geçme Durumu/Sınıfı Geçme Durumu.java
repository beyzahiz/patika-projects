import java.util.Scanner;

public class SınıfGeçmeDurumu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int mat,fizik,turkce,kim,muz;
		
		System.out.print("Matematik notunuzu giriniz: ");
		mat = input.nextInt();
		
		System.out.print("Fizik notunuzu giriniz: ");
		fizik = input.nextInt();
		
		System.out.print("Türkçe notunuzu giriniz: ");
		turkce = input.nextInt();
		
		System.out.print("Kimya notunuzu giriniz: ");
		kim = input.nextInt();
		
		System.out.print("Müzik notunuzu giriniz: ");
		muz = input.nextInt();
		
		if((mat<100 && mat>0) && (fizik<100 && fizik>0) && (turkce<100 && turkce>0) && (kim<100 && kim>0) && (muz<100 && muz>0)) {
			double ortalama = (mat+fizik+turkce+kim+muz)/5;
			if(ortalama>=55) {
				System.out.println("Tebrikler sınıfı başarıyla geçtiniz!");
			}
			else {
				System.out.println("Maalesef sınıfı geçemediniz..");
			}
		}
		else {
			System.out.println("Girdiğiniz notlar 0 ile 100 aralığında değil. Notları tekrardan giriniz.");
		}
	}
}
