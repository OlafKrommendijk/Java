package hoofdstuk7;

//class aangemaakt
public class TekstManipulatie{
	//String gemaakt
		String zin = "Brazilië$ is een$ groot$ lan$d in Zuid$-Amerika";
		
	//maken van een method
	public void stringDemo() {
		System.out.print("Hoofdletters: " + zin.toUpperCase() + "\n");
		System.out.print("Kleine letters: " + zin.toLowerCase() + "\n");
		System.out.print("Aantal tekens: " + zin.length() + "\n");
		System.out.print("Verwijdert alle $: " + zin.replace("$", "") + "\n");
		System.out.print("Eerste 10 letters weg: " + zin.substring(10) + "\n");
		System.out.print("Index van het laatste dollar teken " + zin.indexOf("$") + "\n");
		System.out.print("Vervangt Brazilë door Argentinië: " + zin.replace("Brazilië", "Argentinië") + "\n");
	}
	
	public static void main(String[] args) {
		TekstManipulatie tm = new TekstManipulatie();
		tm.stringDemo();
	}
		
}