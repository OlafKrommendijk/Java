package hoofdstuk3;

public class quiz6{
	public static void main(String[] args) {
		int i1 = 3;
		int i2 = 9;
		int i3 = 12;
		int x = 0;
		
		if(x > - 1) {
			x ++;
			
			if(i3 == ( i1 + i2)) {
				x += 4;
				
				if(i1 < 5) {
					x += 2;
					System.out.print(x);
				}
				else if(i2 == 9) {
					x ++;
				}
				else {
					x -= 2;
				}
				x -= 6;
			}
			if(i3 < 10) {
				x += 7;
			}
			else {
				x += 5;
			}
		}
		System.out.print(x);
	}
}

