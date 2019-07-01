package hoofdstuk4;

public class quiz2{
	public static void main(String[] args) {
		int i = 8;
		
		while(i > 1) {
			i ++;
			System.out.print(i);
			i -= 5;
		}
		
	}
}

// Als je i -= 5 weghaald zal hij blijven lopen omdat het getal niet onder 1 komt.

