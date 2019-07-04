package hoofdstuk14;

//Maakt class Freelancer en implementeert de interface betaling
public class Freelancer implements Betaling{
	//Maakt een variable maandLoon aan
    private int uurloon;
    
    //Haalt het uurloon op
    public Freelancer(int uurloon) {
        this.uurloon = uurloon;
    }

    //Laat in de console het loon zien wat hij uiteindelijk krijgt.
    public void loonBerekenen(int urenGewerkt) {
        System.out.println("Freelancer krijgt " + urenGewerkt*uurloon);
    }
}

