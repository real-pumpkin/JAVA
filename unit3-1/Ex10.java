package ch03.unit01;

public class Ex10 {
	public static void main(String[] args) {
		
		int a, b;
		
		a = 10;
		b = a++ + a++ + 1;
		System.out.println(a + "," + b); // 12 22
		
		a = 10;
		b = ++a + ++a + 1;
		System.out.println(a + "," + b); // 12 24
		
		a = 10;
		b = a++ + ++a + a++ + a++; 
		System.out.println(a + "," + b); // 14 47
		
		a = 0;
		b = a---a; //0 - (-1)
		System.out.println(a+ "," + b); // -1, 1
		
		char c = 'A';
		System.out.println((c++) + "," + (++c)); // A,C
	}
}
