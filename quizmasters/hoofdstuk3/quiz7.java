package hoofdstuk3;

public class quiz7{
	public static void main(String[] args) {
		int i = 2;
		int i2 = 5;
		int i3 = 9;
		int x = 3;
		boolean isLangzaam = true;
		
		if(isLangzaam) {
			x ++;
			System.out.print("x" + x + ", ");
			
			if(i >= 2 && i2 > 7) {
				x += 4;
				System.out.print("x" + x + ", ");
				
				if(i3 == 9) {
					x += 5;
					
					System.out.print("x" + x + ", ");
				}
			}
			else {
				x += 6;
				System.out.print("x" + x + ", ");
				
				if(i3 >= 3) {
					x += 7;
				}
				System.out.print("x" + x + ", ");
			}
			x += 3;
		}
		System.out.print("x" + x);
	}
}

