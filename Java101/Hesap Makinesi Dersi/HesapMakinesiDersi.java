import java.util.Scanner;

public class HesapMakinesiSC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n1,n2,islem;
		System.out.print("Ilk sayiyi giriniz: ");
		n1= input.nextInt();
		System.out.print("Ikinci sayiyi giriniz: ");
		n2=input.nextInt();
		
		System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Hangi işlemi yapmak istiyorsunuz?: ");
		islem=input.nextInt();
		
		switch(islem) {
		case 1: System.out.print("Toplama sonucu: " + (n1+n2)); break;
		case 2: System.out.print("Çıkarma sonucu: " + (n1-n2)); break;
		case 3: System.out.print("Çarpma sonucu: " + (n1*n2)); break;
		case 4: System.out.print("Bölme sonucu: " + (n1/n2)); break;
		
		}
	}
}
