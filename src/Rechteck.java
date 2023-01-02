import java.util.Scanner;
public class Rechteck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		int seiteA, seiteB, flaeche, umfang;
		
		Scanner tastatur = new Scanner(System.in);
		
		System.out.print("SeiteA (in cm):");
		seiteA = tastatur.nextInt();
		
		System.out.print("SeiteB (in cm)");
		seiteB = tastatur.nextInt();
		
		umfang = 2 * seiteA + 2 * seiteB;
		flaeche = seiteA * seiteB;
				
		System.out.println("Umfang = " + umfang + " cm");
		System.out.println("Fläche = " + flaeche + " cm^2");

		tastatur.close();
	}

}
