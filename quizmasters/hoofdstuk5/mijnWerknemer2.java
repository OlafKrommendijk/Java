package hoofdstuk5;

public class mijnWerknemer2{
	String naam;
	double salaris;
	String land;

	//Aanmaken van de constructor
	mijnWerknemer2(String naam, double salaris, String land){
		this.naam = naam;
		this.salaris = salaris;
		this.land = land;
		
		//Output wat per werknemer in de console komt
		System.out.print("------ Werknemer ------" + "\n");
		System.out.print("Naam:           " + naam + "\n");
		System.out.print("Salaris:       €" + salaris + "\n");
		System.out.print("Land:           " + land + "\n");
	}
	public static void main(String[] args) {
		//Gegevens klaarzetten die dankzij de constructor opnieuw aan de variabelen worden gebonden. 
		new mijnWerknemer2("Sofia" , 3100.45, "Nederland");
		new mijnWerknemer2("Daniel", 2400.55, "België");
	}
}