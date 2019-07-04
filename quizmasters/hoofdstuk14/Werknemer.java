package hoofdstuk14;

//Maakt class Werknemer en implementeert de interface betaling
public class Werknemer implements Betaling{
	//Maakt een variable maandLoon aan
    private int maandLoon;

    //Haalt het maandloon van de werkgever op
    public Werknemer(int maandLoon) {
        this.maandLoon = maandLoon;
    }
    
  	//Laat in de console het loon zien wat hij uiteindelijk krijgt.
    public void loonBerekenen(int maandenGewerkt) {
        System.out.println("Werknemer krijgt met belasting " + maandenGewerkt*maandLoon + " euro (" + maandenGewerkt*maandLoon*0.7 + " euro zonder belasting)");
    }

}
	