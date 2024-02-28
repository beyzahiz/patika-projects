import java.util.Scanner;

public class TekSayıGirileneKadar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sayi;
		int toplam=0;
		
		do {
			System.out.print("Sayı giriniz:");
			sayi = input.nextInt();
			
			if(sayi%4==0 ) {
				toplam=sayi+toplam;
				System.out.print(sayi + "  Toplam: " +toplam +"\n");
			}
			
		}while(sayi%2==0);

	}

}
