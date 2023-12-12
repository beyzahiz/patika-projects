import java.util.Scanner;

public class BurcBulanProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String ay;
		int gun;
		
		System.out.print("Doğdunuz ayı giriniz: ");
		ay = input.nextLine();
		
		System.out.print("Doğum gününüz ayın kaçıncı günü? (1-31): ");
		gun = input.nextInt();
		
		if(ay.equalsIgnoreCase("ocak"))  {
			if(gun<=21 && gun>=1) {
				System.out.println("Burcunuz: Oğlak Burcu");
			}
			else {
				System.out.println("Burcunuz: Kova Burcu");
			}
		}
		
		else if(ay.equalsIgnoreCase("şubat")) {
			if(gun<=19 && gun>=1) {
				System.out.println("Burcunuz: Kova Burcu");
			}
			else {
				System.out.println("Burcunuz: Balık Burcu");
			}
		}
		
		else if(ay.equalsIgnoreCase("mart")) {
			if(gun<=20 && gun>=1) {
				System.out.println("Burcunuz: Balık Burcu");
			}
			else {
				System.out.println("Burcunuz: Koç Burcu");
			}
		}
		
		else if(ay.equalsIgnoreCase("nisan")) {
			if(gun<=20 && gun>=1) {
				System.out.println("Burcunuz: Koç Burcu");
			}
			else {
				System.out.println("Burcunuz: Boğa Burcu");
			}
		}
		
		else if(ay.equalsIgnoreCase("mayıs")){
			if(gun<=21 && gun>=1) {
				System.out.println("Burcunuz: Boğa Burcu");
			}
			else {
				System.out.println("Burcunuz: İkizler Burcu");
			}
		}
		
		else if(ay.equalsIgnoreCase("haziran")) {
			if(gun<=22 && gun>=1) {
				System.out.println("Burcunuz: İkizler Burcu");
			}
			else {
				System.out.println("Burcunuz: Yengeç Burcu");
			}
		}
		
		else if(ay.equalsIgnoreCase("temmuz")) {
			if(gun<=22 && gun>=1) {
				System.out.println("Burcunuz: Yengeç Burcu");
			}
			else {
				System.out.println("Burcunuz: Aslan Burcu");
			}
		}
		
		else if(ay.equalsIgnoreCase("ağustos")) {
			if(gun<=22 && gun>=1) {
				System.out.println("Burcunuz: Aslan Burcu");
			}
			else {
				System.out.println("Burcunuz: Başak Burcu");
			}
		}
		
		else if(ay.equalsIgnoreCase("eylül")) {
			if(gun<=22 && gun>=1) {
				System.out.println("Burcunuz: Başak Burcu");
			}
			else {
				System.out.println("Burcunuz: Terazi Burcu");
			}
		}
		
		else if(ay.equalsIgnoreCase("ekim")) {
			if(gun<=22 && gun>=1) {
				System.out.println("Burcunuz: Terazi Burcu");
			}
			else {
				System.out.println("Burcunuz: Akrep Burcu");
			}
		}
		
		else if(ay.equalsIgnoreCase("kasım")) {
			if(gun<=21 && gun>=1) {
				System.out.println("Burcunuz: Akrep Burcu");
			}
			else {
				System.out.println("Burcunuz: Yay Burcu");
			}
		}
		
		else if(ay.equalsIgnoreCase("aralık")) {
			if(gun<=19 && gun>=1) {
				System.out.println("Burcunuz: Yay Burcu");
			}
			else {
				System.out.println("Burcunuz: Oğlak Burcu");
			}
		}
	}
}
