import java.util.Scanner;

public class GirilenSayıyaKadarÇift {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sayi,toplam=0,sayac=0,ort;
		System.out.print("Sayı giriniz: ");
		sayi = input.nextInt();
		
		for(int i=0; i<=sayi; i++) {
			if((i%3 ==0) && (i%4==0)) {
				toplam= i+toplam;
				++sayac;
				
			}
		}
		ort= toplam/sayac;
		System.out.println("Ortalama: " + ort);

	}

}
