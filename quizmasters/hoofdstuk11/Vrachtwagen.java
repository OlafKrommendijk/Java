package hoofdstuk11;

//Importeert de class voertuig
import hoofdstuk11.Voertuig;

//Hier breid de class Voertuig zich uit via de class Vrachtwagen
public class Vrachtwagen extends Voertuig {
	//Voor de class Vrachtwagen naast de 3 "hoofdvariabelen" nog een variabele gedeclareerd
	double Lading;
	
	//Maakt een nieuwe constructor aan voor Vrachtwagen
	public Vrachtwagen(String vMerk, int vBouwjaar, String vKleur, double Lading) {
		//Met super wordt de "parent-constructor" opgehaald en ingevuld.
		super(vMerk, vBouwjaar, vKleur);
			
		//De variabele Passagiers wordt ingevuld met de ingevoerde waarde.
		this.Lading = Lading;
	}
	
	//Output in de console
	public void print() {
		System.out.print("\n" + "---Vrachtwagen---" + "\n");
		// Print de class van voertuig aangezien Vrachtwagen een child is van Voertuig
		super.print(); 
		System.out.print("\nLading: " + Lading + "\n");
	}
	
	
}
