package hoofdstuk5;

class Werknemer{
	//instantievariabelen
	String naam = "Anna";
	int leeftijd = 22;
}

//aanmaken van de class student
class Student{
	//Variabelen instellen
	String naamStudent = "Emma";
	int leeftijdStudent = 25;
	String nummerStudent = "00233-786854";
	String woonplaatsStudent = "Amsterdam";
}

public class quiz1{
	
	public static void main(String[] args) {
		//Maken van 2 nieuwe objecten
		
		Werknemer wn = new Werknemer();
		Werknemer wn2 = new Werknemer();
		
		Student sd = new Student();
		
		wn.naam = "Jan";
		wn.leeftijd = 20;
		
		System.out.print(wn.naam + " ");
		System.out.print(wn2.leeftijd + ", ");
		
		System.out.print(sd.naamStudent + " ");
		System.out.print(sd.leeftijdStudent + " ");
		System.out.print(sd.nummerStudent + " ");
		System.out.print(sd.woonplaatsStudent + " ");
	}
}