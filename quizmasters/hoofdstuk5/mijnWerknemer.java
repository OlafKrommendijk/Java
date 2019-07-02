package hoofdstuk5;

public class mijnWerknemer{
	String naam;
	double salaris = 2400.55;
	String land = "Nederland";



	public static void main(String[] args) {
		//het maken van objecten.
		mijnWerknemer mw = new mijnWerknemer();
		mijnWerknemer mw2 = new mijnWerknemer();
		
		//variabelen per object instellen
		mw.naam = "Sofia";
		mw.salaris = 3100.45;
		mw.land = "België";
		
		mw2.naam = "Daniel";
		
		//output in de console uit printen \n is voor een nieuwe regel
		System.out.print("------ Werknemers ------" + "\n");
		System.out.print("Naam:           " + mw.naam + "\n");
		System.out.print("Salaris:       €" + mw.salaris + "\n");
		System.out.print("Land:           " + mw.land + "\n");
		
		System.out.print("----------" + "\n");
		System.out.print("Naam:           " + mw2.naam + "\n");
		System.out.print("Salaris:       €" + mw2.salaris + "\n");
		System.out.print("Land:           " + mw2.land + "\n");
	}
}