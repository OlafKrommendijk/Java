package hoofdstuk6;

public class Goud{
	double getOunce(double Ounces) {
		//Maakt een double met de waarde van 1 ounce
		double bedrag = 1300.00;
		
		// Geeft de hoeveelheid Ounces terug die je krijgt voor het geld bedrag
		return Ounces / bedrag;
	}
	
	public static void main(String[] args) {
		//maken van object
		Goud goud = new Goud();
		
		//output in console
		System.out.print(goud.getOunce(7150.00) + "\n");
		System.out.print(goud.getOunce(1300.00) + "\n");
		System.out.print(goud.getOunce(2600.00) + "\n");
		System.out.print(goud.getOunce(5525.00) + "\n");
	}
}