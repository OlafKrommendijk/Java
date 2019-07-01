package hoofdstuk4;

public class quiz10{
	public static void main(String[] args) {
		for(int rij = 1; rij <= 5; rij ++) {
			if(rij == 2 || rij == 4 || rij == 5) {
				for(int kol = 1; kol < 4; kol ++) {
					System.out.print(rij + "," + kol + " ");
				}
			}
		}
	}
}
