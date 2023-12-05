import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double tmetre,km;
		
		System.out.print("Kilometreyi giriniz: ");
		km = input.nextDouble();
		tmetre = 10 + (km* 2.20);
		
		if(tmetre<20) {
			System.out.println("Ödenecek tutar: 20 TL");
		}
		else {
			System.out.println("Ödenecek tutar: " + tmetre + " TL");
		}
	}

}
