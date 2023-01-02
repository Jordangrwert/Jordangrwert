import java.util.Scanner;
public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t;
		
		int l;
		
		int i;
		
		int zahl1 = 0;

		int zahl2 = 0;

		int ergebnis = 0;

		Scanner tastatur = new Scanner(System.in);

		System.out.print("Bitte geben Sie eine ganze Zahl ein: ");

		zahl1 = tastatur.nextInt();

		System.out.print("Bitte geben Sie eine zweite ganze Zahl ein: ");

		zahl2 = tastatur.nextInt();

		ergebnis = zahl1 + zahl2;
		t =  zahl1*zahl2;
		l =  zahl1/zahl2;
		i =  zahl1-zahl2;
		System.out.println("\nSumme: " + ergebnis);
		System.out.println("\nProdukt: " + t);
		System.out.println("\nQuotient: " + l);
		System.out.println("\nDifferenz: " + i);

		tastatur.close();
	}

}
