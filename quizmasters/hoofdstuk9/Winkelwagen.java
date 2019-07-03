package hoofdstuk9;

import java.util.ArrayList;

public class Winkelwagen{
	//Maken van een ArrayList
	ArrayList<Artikel> artikelen = new ArrayList<Artikel>();
	
	//Nieuwe artikelen instellen
	Artikel art1 = new Artikel("Overhemd", 20.39);
	Artikel art2 = new Artikel("Broek", 32.85);
	Artikel art3 = new Artikel("Sokken", 11.25);
	Artikel art4 = new Artikel("Jas", 120.65);
	
	//Methode om namen en prijzen van artikelen weg te schrijven
	public void printArtikelen() {
		//De gekozen producten van de klant
		artikelen.add(art1);
		artikelen.add(art2);
		artikelen.add(art4);
		
		//Geeft voor elk artikel de naam en de prijs in de output
		for(int i = 0; i < artikelen.size(); i++) {
			System.out.print(artikelen.get(i).naam + " " + artikelen.get(i).prijs + "\n");
		}
	}

	public static void main(String[] args) {
		//Het uitvoeren van de code
		Winkelwagen winkel = new Winkelwagen();
		winkel.printArtikelen();
	}
}