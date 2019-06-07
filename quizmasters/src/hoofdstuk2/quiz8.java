package src.hoofdstuk2;

public class quiz8{
	public static void main(String[] args) {
		int i1 = 22;
		int i2 = 17;
		int i3 = 30;
		
		i1 %= 6;
		i2 %= 5;
		i3 %= 6;
		
		i1 %= 3;
		i2 %= 7;
		
		System.out.print(i1 + ", ");
		System.out.print(i2 + ", ");
		System.out.print(i3);

	}
}