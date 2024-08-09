package ch03.unit02;

public class Ex04 {

	public static void main(String[] args) {
		int a, b;
		boolean c;
		
		a=20; b=20;
		c = ++a > 20 && ++b > 20; // 21, 21, true
		System.out.println(a+ "," + b +"," + c);

		a=20; b=20;
		c = a++ > 20 && b++ > 20; // 21, 20, false
		System.out.println(a+ "," + b +"," + c);
		
		a=20; b=20;
		c = ++a > 20 && b++ > 20; // 21, 21, false
		System.out.println(a+ "," + b +"," + c);

		a=20; b=20;
		c = ++a > 20 || ++b > 20; // 21, 20, true 
		System.out.println(a+ "," + b +"," + c);

		a=20; b=20;
		c = a++ > 20 || b++ > 20; // 21, 21, false
		System.out.println(a+ "," + b +"," + c);

		a=20; b=20;
		c = ++a > 20 || b++ > 20; // 21, 20, false
		System.out.println(a+ "," + b +"," + c);
	}
}
