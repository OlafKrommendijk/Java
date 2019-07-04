package hoofdstuk11;

public class testProgramma {
	public static void main(String[] args) {
		new Auto("Toyota", 2013, "Rood", 5).print(); //Aanmaken van nieuwe auto
		new Auto("Mazda", 2017, "Blauw", 8).print(); //Aanmaken van nieuwe auto
		new Vrachtwagen("BMW", 2016, "Groen", 6555.0).print(); //Aanmaken van nieuwe vrachtwagen
		new Vrachtwagen("Volvo", 2014, "Zwart", 4000.0).print(); //Aanmaken van nieuwe vrachtwagen
	}
}
