package hoofdstuk5;

class mijnWerknemer{
	String naam = "";
	double salaris = 2400.55;
	String land = "Nederland";
}

public class eind5{
	public static void main(String[] args) {
		//Maken van nieuwe objecten
		mijnWerknemer mw = new mijnWerknemer();
		mijnWerknemer mw2 = new mijnWerknemer();
		
		//variabelen per object instellen
		mw.naam = "Sofia";
		mw.salaris = 3100.45;
		mw.land = "België";
		
		mw2.naam = "Daniel";
		
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