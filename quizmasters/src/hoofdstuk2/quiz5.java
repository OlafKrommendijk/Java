package src.hoofdstuk2;

public class quiz5{
	public static void main(String[] args) {
		boolean isDefect = false;
		int x = 1;
		int y = 7;
		int z = 9;
		
		if(x < y && x > 1) {
			System.out.print("N");
		}
		
		if(z > y || x > y) {
			System.out.print("O");
		}
		
		if( ! isDefect) {
			System.out.print("P");
		}
		
		
	}
}