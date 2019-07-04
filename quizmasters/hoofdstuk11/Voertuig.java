package hoofdstuk11;

//Dit de class die bij Auto en Vrachtwagen ook weer wordt gebruikt dus declareren we de 3 "hoofdvariabelen" de variabelen die elke class nodig heeft
public class Voertuig {
	 String Merk;
	 int Bouwjaar;
	 String Kleur;
	
	 //De constructor die wordt gebruikt om nieuwe objecten te maken, ook hier wordt in andere classes naar verwezen
	public Voertuig(String vMerk, int vBouwjaar, String vKleur) {
		this.Merk = vMerk; 
		this.Bouwjaar = vBouwjaar;
		this.Kleur = vKleur;
	}
	
	//Printen van de 3 "hoofdvariabelen" naar de console
	public void print() {
		System.out.print("Merk: " + Merk + "\nBouwjaar: " + Bouwjaar +  "\nKleur: " + Kleur);
	}
}
