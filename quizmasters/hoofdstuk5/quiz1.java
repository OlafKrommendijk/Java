package hoofdstuk5;

class Werknemer{
	//instantievariabelen
	String naam = "Anna";
	int leeftijd = 22;
}

//aanmaken van de class student
class Student{
	//instantievariabelen
	String naamStudent = "Emma";
	int leeftijdStudent = 25;
	String nummerStudent = "00233-786854";
	String woonplaatsStudent = "Amsterdam";
}

public class quiz1{
	
	public static void main(String[] args) {
		//Maken van 2 nieuwe objecten (werknemers)
		Werknemer wn = new Werknemer();
		Werknemer wn2 = new Werknemer();
		
		//Maken van 2 nieuwe objecten (Studenten)
		Student sd = new Student();
		Student sd2 = new Student();
		
		//variabelen meegeven
		wn.naam = "Jan";
		wn.leeftijd = 20;
		
		sd2.naamStudent = "Jan";
		sd2.leeftijdStudent = 33;
		sd2.nummerStudent = "00383-384833";
		sd2.woonplaatsStudent = "Brussel";
		
		//Uitvoer in de console
		System.out.print(wn.naam + " ");
		System.out.print(wn2.leeftijd + ", ");
		
		System.out.print(sd.naamStudent + " ");
		System.out.print(sd.leeftijdStudent + " ");
		System.out.print(sd.nummerStudent + " ");
		System.out.print(sd.woonplaatsStudent + ", ");
		
		System.out.print(sd2.naamStudent + " ");
		System.out.print(sd2.nummerStudent + " ");
		System.out.print(sd2.woonplaatsStudent + " ");
	}
}