package ch06.unit02;

public class Ex02 {
	public static void main(String[] args) {
		// 객체 선언과 메모리 할당
		Test2 t = new Test2();
		
		// System.out.println(t.a); // 컴오류
		System.out.println(t.b);
		System.out.println(t.c);
		System.out.println(t.d);
	}
}

class Test2 {
	// 필드 접근 제어자
	// private < 디폴트 < protected < public
	
	private int a = 10;		// 클래스 내에서만 접근 가능
	int b = 20;				// 디폴트. 동일한 패키지에서만 접근 가능
	protected int c = 30;	// 하위클래스 및 다른 클래스는 동일 패키지에서만 접근 가능
	public int d = 40;		// 어디에서나 접근 가능
	
	public void write() {
		System.out.println(a + ":" + b + ":" + c + ":" + d);
	}
}