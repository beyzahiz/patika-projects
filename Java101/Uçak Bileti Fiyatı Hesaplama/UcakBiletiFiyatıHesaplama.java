import java.util.Scanner;

public class UçakBiletiFiyatı {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int mesafe,yas,tip;
		float tutar,ytutar = 0;
		System.out.print("Mesafeyi km türünden giriniz: ");
		mesafe = input.nextInt();
		
		System.out.print("Yaşınızı giriniz: ");
		yas = input.nextInt();

		System.out.print("Yolculuk tipini giriniz (1=> Tek Yönn, 2=> Gidiş Dönüş): ");
		tip = input.nextInt();
		
		if(mesafe>0 && yas>0 ) {
			if(tip==1 || tip==2) {
				tutar = (float) (mesafe * 0.10) ;
				if(yas<12) {
					ytutar = tutar / 2;
				}
				else if(yas>=12 && yas<=24) {
					ytutar = (tutar * 90)/100;
				}
				else if(yas>24 && yas<65) {
					ytutar = tutar ;
				}
				else if(yas>=65) {
					ytutar = (tutar * 70)/100;
				}
			}
		}
		
		else {
			System.out.println("Hatalı veri girdiniz!");
		}
		
		if(tip==1) {
			System.out.println("Toplam Tutar = " + ytutar);
		}
		
		else if(tip==2) {
			ytutar = (ytutar * 80)/100;
			ytutar = 2 * ytutar;
			System.out.println("Toplam Tutar = " + ytutar);
		}
	}
}
