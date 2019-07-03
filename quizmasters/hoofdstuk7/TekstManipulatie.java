package hoofdstuk7;


//class aangemaakt
public class TekstManipulatie{
	//maken van een method
	public void stringDemo(String zin) {
		System.out.print("Hoofdletters: " + zin.toUpperCase() + "\n");
		//Zet de tekst naar hoofdletters
		System.out.print("Kleine letters: " + zin.toLowerCase() + "\n");
		//Zet de tekst naar kleine letters
		System.out.print("Aantal tekens: " + zin.length() + "\n");
		//Checkt de lengte van de tekst en laat zien hoeveel dit is
		System.out.print("Verwijdert alle $: " + zin.replace("$", "") + "\n");
		//haalt alle dollartekens uit de tekst
		System.out.print("Eerste 10 letters weg: " + zin.substring(10) + "\n");
		//Haalt de eerste 10 letters van de zin af
		
		//Nieuw toegevoegd
		System.out.print("Levert groot op: " + zin.substring(18, 23) + "\n");
		//Levert groot op:
		System.out.print("Index van het eerste dollar teken " + zin.indexOf("$") + "\n");
		//Kijkt waar het eerste dollar teken staat
		
		
		System.out.print("Index van het laatste dollar teken " + zin.lastIndexOf("$") + "\n");
		//kijkt waar het laatste dollar teken staat
		System.out.print("Vervangt Brazilë door Argentinië: " + zin.replace("Brazilië", "Argentinië") + "\n");
		//Vervangt het woord "Brazilië door Argentinië
	}
	
	public static void main(String[] args) {
		//String in main zodat grote boze programmeurs geen boze dingen vanuit andere classes kunnen doen
		String zin = "Brazilië$ is een$ groot$ lan$d in Zuid$-Amerika";
		
		//uitvoeren van de method
		TekstManipulatie tm = new TekstManipulatie();
		tm.stringDemo(zin);
	}
		
}