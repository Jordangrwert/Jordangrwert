import java.util.Scanner;



public class Währungsrechner {

	public static void main(String[] args) {
		// Stand 04.10.22 1530
		double money = 5.50;
		
		System.out.println("Was möchten sie Umwandeln?");
		System.out.println("Dollar,Ruble,Dinar,Pfund,Krone");
		
	
		
		
		Scanner tastatur = new Scanner (System.in);
		
	
	
		convertToDollars(money);
		
		
		
		
		convertToRuble(money);
	}
		
	
 public static void convertToDollars(double eur) {
	 
	 System.out.println(eur * 0.99);
	 
	 
 }
 public static void convertToRuble(double eur) {
	 
	 
	 System.out.println(eur * 58.86 );
	 
	 
	 
 }
 
}
