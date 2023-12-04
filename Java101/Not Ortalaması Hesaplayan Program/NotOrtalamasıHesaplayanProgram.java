import java.util.Scanner;

public class NotOrtHesaplama {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mat,fiz,kim,turkce,tarih,muz,ort;
		
		System.out.print("Matematik notunuzu giriniz: ");
		mat=input.nextInt();
		
		System.out.print("Fizik notunuzu giriniz: ");
		fiz=input.nextInt();
		
		System.out.print("Kimya notunuzu giriniz: ");
		kim=input.nextInt();
		
		System.out.print("Türkçe notunuzu giriniz: ");
		turkce=input.nextInt();
		
		System.out.print("Tarih notunuzu giriniz: ");
		tarih=input.nextInt();
		
		System.out.print("Müzik notunuzu giriniz: ");
		muz=input.nextInt();
		
		ort=(mat+fiz+kim+turkce+tarih+muz)/6;
		System.out.println("Ortalamanız: " + ort);
		
		if(ort>60) {
			System.out.println("Sınıfı Geçtiniz! Tebrikler!");
		}
		else {
			System.out.println("Maalesef Sınıfta Kaldınız..");
		}
	}
}
