package ch08.unit04;

public class Ex02 {
	public static void main(String[] args) {

	}
}

class Test2 {
	final int a;
	final int b = 10;
	
	final static int c;
	final static int d = 30;
	
	static {
		c = 20;
	}
	
	public Test2() {
		a = 5;
	}
	
	public void sub(final int n) { // 매개변수가 final
		// n = 5; // 컴오류
		// a = 5; // 컴오류
		
		final int x = 100; // final 지역 변수
		final int y;
		y = 200; // 한번만 가능
		
		// y++; // 컴오류
		
		System.out.println(x+","+y);
	}
	
	public final void disp() { // 하위 클래스에서 재정의 불가
		System.out.println("disp...");
	}
}

class Demo2 extends Test2 {
	// public void disp() {  } // 컴오류
}

/*
final class A {} // 하위 클래스를 가질수 없음
class B extends A {} // 컴오류
*/

