package hoofdstuk5;

class mijnKlasse{
	//Bij class variabelen instellen
	int x;
	int y = 7;
}

public class quiz2{
	public static void main(String[] args) {
		mijnKlasse mk = new mijnKlasse();
		//variabelen instellen
		mk.x = 5;
		mk.y = 8;
		//Nieuwe objecten maken
		mijnKlasse mk2 = new mijnKlasse();
		mijnKlasse mk3 = mk;
		
		mijnKlasse mijnKlasse = mk3;
		
		//Output in de console
		System.out.print(mk.x + " " + mk2.x + " " + mk3.y + ",  ");
		System.out.print(mijnKlasse.x + ", " + mijnKlasse.y);
		
		//output is zo omdat het object mijnKlasse verwijst naar het object mk3, deze verwijst weer naar het object mk, hier is variable x 5 en variable y 8.
	}
}