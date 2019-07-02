package hoofdstuk9;

import java.util.ArrayList;

public class Winkelwagen{
	//Maken van een ArrayList
	ArrayList<Artikel> artikelen = new ArrayList<Artikel>();

	//Artikelen aan de array toevoegen
	public Winkelwagen(){
		artikelen.add(new Artikel("Overhemd", 20.39));
		artikelen.add(new Artikel("Broek", 32.85));
		artikelen.add(new Artikel("Sokken", 11.25));
		artikelen.add(new Artikel("Jas", 120.65));
	}
	
	//Methode om namen en prijzen van artikelen weg te schrijven
	public void printArtikelen() {
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