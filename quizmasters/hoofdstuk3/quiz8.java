package hoofdstuk3;

public class quiz8{
	public static void main(String[] args) {
		int x = 8;
		
		switch(x) {
			case 6: x += 5;
			case 7: x += 3;
			case 8: x += 2;
			case 9: x ++;
			
			break;
			default: x += 4;
		}
		System.out.print(x);

	}
}

// Vraag 1, als je break weghaalt wordt er 15 naar de standaarduitvoer geschreven
// Vraag 2, als je een break onder case 8 zit wordt er 10 naar de standaarduitvoer geschreven