package hoofdstuk14;

public class Test {
    public static void main(String[] args) {
    	//Maakt nieuwe objecten aan. (getal tussen haakjes is het geld per uur in euro's)
       Freelancer freelancer = new Freelancer(60);
       Werknemer werknemer = new Werknemer(3000);

       //Rekent meet loonBerekenen het loon uit. (Getal tussen haakjes is uren gewerkt, voor werknemer maanden gewerkt)
       freelancer.loonBerekenen(140);
       werknemer.loonBerekenen(1);
    }
}
