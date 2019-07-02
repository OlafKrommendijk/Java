package hoofdstuk6;

public class Gold{
	//methode voor het uitrekenen van de hoeveelheid ounces die je voor een bepaal bedrag krijgt.
	double getOunce(double Ounces) {
		//Maakt een double met de waarde van 1 ounce
		double price = 1300.00;
		
		// Geeft de hoeveelheid Ounces terug die je krijgt voor het geld bedrag
		return Ounces / price;
	}
	
	public static void main(String[] args) {
		//maken van object
		Gold gold = new Gold();
		
		//output in console, (Roept de methode aan met het geldbedrag dat iemand wilt betalen, de hoeveelheid ounces wordt teruggeven)
		System.out.print(gold.getOunce(7150.00) + "\n");
		System.out.print(gold.getOunce(1300.00) + "\n");
		System.out.print(gold.getOunce(2600.00) + "\n");
		System.out.print(gold.getOunce(5525.00) + "\n");
	}
}