import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00, a,e,d,m,p,tt;
		System.out.print("Armut kaç kilo?: ");
		a = input.nextDouble();
		
		System.out.print("Elma kaç kilo?: ");
		e= input.nextDouble();
		
		System.out.print("Domates kaç kilo?: ");
		d = input.nextDouble();
		
		System.out.print("Muz kaç kilo?: ");
		m = input.nextDouble();
		
		System.out.print("Patlıcan kaç kilo?: ");
		p = input.nextDouble();
		
		tt = (armut*a)+(elma*e)+(domates*d)+(muz*m)+(patlican*p);
		
		System.out.print("Toplam tutar: " + tt + " TL");

	}

}
