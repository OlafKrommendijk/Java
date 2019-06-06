package hoofdstuk1;

public class Arbeider{
	//Twee boolean's, standaard is false wij gaan er vanuit dat de meeste werknemers buitenlands zijn dus =true
	static boolean isGetrouwd;
	static boolean isBuitenlander = true;
	
	public static void main(String[] args) {
		int leeftijd = 45;
		long bankrekening = 298888888;
		double loon = 124.89;
		char geslacht = 'm'; //Voor vrouw kies V, Man is M
		System.out.print(leeftijd + ", ");
		System.out.print(bankrekening + ", ");	
		System.out.print(loon + ", ");
		System.out.print(isGetrouwd + ", ");
		System.out.print(isBuitenlander + ", ");
		System.out.print(geslacht);
		//Door het veranderen van de waarden zijn de waarden in de uitvoer ook anders
	}
}