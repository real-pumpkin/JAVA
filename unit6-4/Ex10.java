package ch06.unit04;

public class Ex10 {
	public static void main(String[] args) {
		Test10 t = new Test10();
		t.disp();
	}
}

class Test10 {
	public static int a = 10;
	
	// final 변수 : 한번만 초기화 되며 값을 변경할 수 없음
	
	public final static double PI = 3.141592;
	public final static int X;
	
	static { // static 초기화 블록에서 final static 변수 초기화
		X = 100;
	}
	
	final int b = 10; // 인스턴스 final 변수
	final int c;
	
	public Test10() {
		// X = 100; // final static 변수는 생성자에서 초기화 불가능
		c = 100; // 인스턴스 final 변수 초기화 
	}
	
	public void disp() {
		// c = 200; // 컴오류
		System.out.println(b + ":" + c);
	}
	
	public int sum(final int n) {
		// n = 10; // final 매개변수는 변경 불가
		int s = 0;
		
		for(int i = 1; i<=n; i++) {
			s += i;
		}
		
		return s;
	}
}

