import java.util.Scanner;

public class DaireAlanCevre {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double r,alan,cevre,pi=3.14;
		System.out.print("Dairenin yarıçap değerini giriniz: ");
		r= input.nextDouble();
		alan=pi*r*r;
		cevre=2*pi*r;
		
		System.out.println("Dairenin alanı: " + alan);
		System.out.println("Dairenin çevresi: " + cevre);
	}

}
