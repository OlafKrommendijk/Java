//Aangeven welke package er wordt gebruikt
package kalender;

public class Datum {
	//Declareren van variabelen als private
	private int dag;
	private int maand;
	private int jaar;
	
	//Methode die de datum in het juiste formaat oplevert
	public String datumFormaat(int dag, int maand, int jaar) {
		String geboortejaar = Integer.toString(dag) + "-" + Integer.toString(maand) + "-" + Integer.toString(jaar);
		//Geeft de string terug op de juiste manier
		return(geboortejaar);
	}
}


