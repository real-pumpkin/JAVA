package ch07.unit06;

public class Ex01 {
	public static void main(String[] args) {
		// Math 클래스
		double a;
		
		System.out.println(Math.PI);
		
		a = Math.sin(30.0 * Math.PI / 180.);
		System.out.println(a);
		
		a = Math.sqrt(2.0); // 제곱근
		System.out.println(a);
		
		a = Math.pow(2.0, 10.0);
		System.out.println(a);
		
		System.out.println(Math.floor(12.7)); // 12
		System.out.println(Math.ceil(12.7)); // 13
		System.out.println(Math.floor(-12.7)); // -13
		System.out.println(Math.ceil(-12.7)); // -12
		
		a = Math.random(); // 0 <= 난수 < 1
		System.out.println(a);
	}
}
