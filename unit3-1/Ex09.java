package ch03.unit01;

public class Ex09 {
	public static void main(String[] args) {
		int a, b;
		
		a = 10;
		b = ++a; // a = a+1, b=a; 와 동일한 결과
		System.out.println(a + "," + b); // 11 11
		
		a = 10;
		b = a++; // b = a, a = a + 1; 동일한 결과
		System.out.println(a + "," + b); // 11 10

		a = 10;
		b = a--;
		System.out.println(a + "," + b); // 9 10
		
		a = 10;
		b = --a;
		System.out.println(a + "," + b); // 9 9
		
		double c = 3.5;
		c++;
		System.out.println(c); // 4.5
		
	}
}
