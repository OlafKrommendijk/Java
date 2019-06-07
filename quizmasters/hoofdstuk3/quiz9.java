package hoofdstuk3;

public class quiz9{
	public static void main(String[] args) {
		int intMaand = 10;
		String strMaand;
		
		switch(intMaand) {
		case 1: strMaand = "jan ";
		break;
		
		case 2: strMaand = "feb ";
		break;
		
		case 3: strMaand = "mrt ";
		break;
		
		case 4: strMaand = "apr ";
		break;
		
		case 5: strMaand = "mei ";
		break;
		
		case 6: strMaand = "jun ";
		break;
		
		case 7: strMaand = "jul ";
		break;
		
		case 8: strMaand = "aug ";
		break;
		
		case 9: strMaand = "sep ";
		break;
		
		case 10: strMaand = "okt ";
		break;
		
		case 11: strMaand = "nov ";
		break;
		
		case 12: strMaand = "dec ";
		break;
		
		default: strMaand = "Ongeldig ";
		}
		System.out.println(strMaand);
	}
}
