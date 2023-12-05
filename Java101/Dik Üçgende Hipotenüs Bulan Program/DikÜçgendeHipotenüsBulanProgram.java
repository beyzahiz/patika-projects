import java.util.Scanner;

public class Hipotenus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k1,k2,hipo,alan,cevre,u;
		
		System.out.println("Dik üçgenin dik kenarlarını giriniz: ");
		k1 = input.nextInt();
		k2 = input.nextInt();
		
		hipo = (int) Math.sqrt((k1*k1)+(k2*k2));
		System.out.println("Hipotenüs kenarı: " + hipo);
		
		u = (k1+k2+hipo)/2;
		cevre= 2*u;
		alan = (int) Math.sqrt(u * (u-k1) * (u-k2) * (u-hipo));
		
		System.out.println("Üçgenin çevresi: " + cevre);
		System.out.println("Üçgenin alanı: " + alan);
	}

}
