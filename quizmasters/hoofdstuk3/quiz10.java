package hoofdstuk3;

public class quiz10{
	public static void main(String[] args) {
		char resultaat = 'D';
		
		switch(resultaat) {
		case 'A': System.out.print("Uitstekend! ");
		break;
		
		case 'B': System.out.print("Zeer goed! ");
		break;
		
		case 'C': System.out.print("Goed! ");
		break;
		
		case 'D': System.out.print("Redelijk! ");
		break;
		
		case 'E': System.out.print("Probeer het opnieuw ");
		break;
		
		default: System.out.print("Ongeldig ");
		
		}
		 
	}
}
//Als resultaat gelijk is aan N wordt ongeldig naar de standaarduitvoer geschreven
