import java.util.Scanner;

public class KullanıcıGirisiDersi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int ka,sifre,s2;
		System.out.print("Kullanıcı adınızı giriniz: ");
		ka=input.nextInt();		
		System.out.print("Şifrenizi giriniz: ");
		sifre=input.nextInt();
		
		if((ka==123) && (sifre==456)) {
			System.out.println("Giriş başarılı.");
		}
		else {
			System.out.println("Giriş başarısız!");
			String h;
			System.out.println("Şifrenizi sıfırlamak ister misiniz? (E/H):");
			input.nextLine();
			h = input.nextLine();
		
			switch(h.toUpperCase()) {
			case "E": 
				System.out.print("Yeni şifrenizi giriniz: ");
				s2=input.nextInt();
				if(s2 != sifre){
					System.out.print("Şifre oluşturuldu!");
				}
				else {
					System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
				} 
				break;
			case "H": 
				System.out.print("İyi günler dileriz.");
				break;
				}
			}
		}
	}
