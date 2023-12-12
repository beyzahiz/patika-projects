import java.util.Scanner;

public class EtkinlikOnerme {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sicaklik;
		
		System.out.print("Sıcaklık değerini giriniz: ");
		sicaklik = input.nextInt();
		
		if(sicaklik<5) {
			System.out.println("Hava tam kayak kayma havası!");
		}
		else if(sicaklik>5 && sicaklik<15){
			System.out.println("Bu havada sinema harika olur!");
		}
		else if(sicaklik>15 && sicaklik<25) {
			System.out.println("Bu güzel havayı piknikle değerlendirmeye ne dersin?");
		}
		else {
			System.out.println("Bu sıcak havada en iyisi yüzmek!");
		}
	}
}
