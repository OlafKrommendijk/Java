package hoofdstuk4;

public class quiz11{
	public static void main(String[] args) {
		outer:for(int rij = 1; rij < 4; rij ++) {
			inner:for(int kol = 1; kol < 5; kol ++) {
				if(rij == 2 && kol == 3) {
					break inner;
				}
				System.out.print(rij + "," + kol + " ");
			}
		}
		
	}
}
