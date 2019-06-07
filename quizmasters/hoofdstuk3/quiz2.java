package hoofdstuk3;

public class quiz2{
	public static void main(String[] args) {
		int a = 3;
		int b = 1;
		int x = 0;
		
		if(a > b) {
			x ++;
		
			if(a > x) {
				x += 5;
			}
			x -= 4;
		}
		
		if (b == a) {
			x += 2;
			
			if(x < b) {
				x += 3;
			}
		}
		
		System.out.print(x);
		
		if(a <= 4) {
			System.out.print("G");
		}
		
	}
}

