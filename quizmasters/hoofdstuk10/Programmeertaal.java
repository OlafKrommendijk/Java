package hoofdstuk10;


public class Programmeertaal {
	//Maakt een variable van het aantal talen en de taal
	private static int aantal;
	private static String taal = "";
	
	private Programmeertaal(String taalNaam) {
		//Voor elke nieuwe taal die erbij komt wordt er opgeteld op de variabele aantalTalen
		aantal++;
		
		//Elke nieuwe taal die wordt toegevoegd wordt ook bij de string op gezet
		taal += taalNaam + " ";		
	}
	
	public static void main(String[] arg) {
		//Vijf objecten van de class programmeertaal
		new Programmeertaal("Java");
		new Programmeertaal("C++");
		new Programmeertaal("Python");
		new Programmeertaal("PHP");
		new Programmeertaal("Ruby");
	
		//Output in de console
		System.out.print(taal + "\n"+ "Aantal talen: " + aantal);
	}
}
