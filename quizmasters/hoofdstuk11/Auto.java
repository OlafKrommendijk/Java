package hoofdstuk11;

//Importeert de class voertuig
import hoofdstuk11.Voertuig;

//Hier breid de class Voertuig zich uit via de class Auto
public class Auto extends Voertuig {
	//Voor de class Auto naast de 3 "hoofdvariabelen" nog een variabele gedeclareerd
	int Passagiers;
	
	//Maakt een nieuwe constructor aan voor auto
	public Auto(String vMerk, int vBouwjaar, String vKleur, int Passagiers){
		//Met super wordt de "parent-constructor" opgehaald en ingevuld.	
		super(vMerk, vBouwjaar, vKleur);
		
		//De variabele Passagiers wordt ingevuld met de ingevoerde waarde.
		this.Passagiers = Passagiers;
	}
	
	//Output in de console
	public void print() {
		System.out.print("\n" + "---Auto---" + "\n");
		// Print de class van voertuig aangezien Auto een child is van Voertuig
		super.print(); 
		System.out.print("\nPassagiers: " + Passagiers + "\n");
	}
}
