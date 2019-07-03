package hoofdstuk9;

public class Artikel{
	//variabelen public declareren
	public String naam;
	public double prijs;
	
	//Constructor voor Artikel gedefineerd om namen en prijzen te initialiseren
	public Artikel(String naam, double prijs){
		this.naam = naam;
		this.prijs = prijs;
	}
}



	
//9 door robin
//import java.util.ArrayList;
//
//public class Winkelwagen
//{
//  private ArrayList<Artikel> artikelen = new ArrayList<Artikel>();
//  public void printArtikelen()
//  {
//    for (int i = 0; i < artikelen.size(); i++)
//    {
//      int artikelId = i + 1;
//      System.out.println("Artikel" + artikelId + ": " + artikelen.get(i).naam + ", Prijs: € " + artikelen.get(i).prijs);
//    }
//  }
//  public static void main(String[] args)
//  {
//    Artikel artikel = new Artikel("Overhemd ", 20.39);
//    Artikel artikel2 = new Artikel("Broek", 32.85);
//    Artikel artikel3 = new Artikel("Sokken", 11.25);
//    Artikel artikel4 = new Artikel("Jas ", 120.65);
//    Winkelwagen sc = new Winkelwagen();
//    sc.artikelen.add(artikel);
//    sc.artikelen.add(artikel2);
//    sc.artikelen.add(artikel3);
//    sc.artikelen.add(artikel4);
//    sc.printArtikelen();
//  }
//}
