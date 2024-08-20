package ch06.unit02;

public class Ex05 {
	public static void main(String[] args) {
		Test5.disp(); // 클래스 메소드 호출
		
		Test5 t = new Test5();
		t.write(); // 인스턴스 메소드 호출
	}
}

class Test5 {
	// 인스턴스변수:객체를 생성해야 메모리 할당
	int a;
	int b = 10;
	
	// 클래스변수:클래스가 로딩될때 메모리할당
	static int c = 20;
	
	// 인스턴스메소드:객체를 생성해야 호출가능
	public void write() {
		System.out.println(a+":"+b+":"+c);
	}
	
	// 클래스메소드:객체생성과 상관없이 호출
	public static void disp() {
		// System.out.println(a); // 컴오류
		System.out.println(c);
	}
}
