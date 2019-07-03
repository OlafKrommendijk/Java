package gegevens;

//importeren van de eerder gemaakte class
import kalender.Datum;

//maken van nieuwe class
public class Student {
	//Methode die een nieuwe student kan maken
	String nieuwStudent(int dag, int maand, int jaar, String naam) {
		//Maakt een nieuw datum object
		Datum datum = new Datum();
		//geeft de naam en geboortedatum van de student op de juiste manier terug
		return("Naam: " + naam + "\n" + "Geboortedatum: " + datum.datumFormaat(dag, maand, jaar) + "\n\n");
	}
	
	//Uitvoeren van de code
	public static void main(String[] args){
		//Maken van nieuwe studenten objecten
		Student student1 = new Student();
		Student student2 = new Student();
		
		//De uitvoer van de code in de console        Gegevens van de nieuwe student invoeren.
		System.out.print("--- Eerste Student--- \n" + student1.nieuwStudent(28, 8, 1998, "Emma"));
		System.out.print("--- Tweede Student--- \n" + student2.nieuwStudent(13, 9, 1996, "David"));
	}
}