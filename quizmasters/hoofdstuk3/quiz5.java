package hoofdstuk3;

public class quiz5{
	public static void main(String[] args) {
		int i = 1;
		int i2 = 4;
		int x = 2;
		
		if(i == (i2 -3) && i2 > 5) {
			x ++;
		}
		else if(i + i2 == 5) {
			System.out.print("D");
		}
		else if(i2 == 4) {
			x += 2;
		}
		else if(i2 > 3) {
			x += 3;
		}

		else {
			x += 4;
		}

		System.out.print(x);
	}
}

