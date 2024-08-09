package ch03.unit02;

public class Ex03 {

	public static void main(String[] args) {
		
		int a; 
		boolean b1, b2;
		
		a = 10;
		
		b1 = false;
		b2 = a > 20 && (b1 = true); //단축연산
		System.out.println(b1 + "," + b2); //false, false
		
		b1 = false;
		b2 = a < 20 && (b1 = true); // true
		System.out.println(b1 + "," + b2); //true, true
		
		b1 = false;
		b2 = a > 20 || (b1 = true); // true
		System.out.println(b1 + "," + b2); //true, true
		
		b1 = false;
		b2 = a < 20 || (b1 = true); // 단축연산
		System.out.println(b1 + ","+ b2); // false, true 
	}
}
