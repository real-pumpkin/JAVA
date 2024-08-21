package ch06.unit04;

public class Ex07 {
	public static void main(String[] args) {
		Test7 t = new Test7();
		t.set(100);
		t.print();
		
		Test7.sub(20);
		System.out.println(Test7.b);
	}
}

class Test7 {
	private int a;
	static int b = 10;
	
	public void set(int a) {
		this.a = a;
	}
	
	public void print() {
		// System.out.println("a:"+this.a); // this 생략 가능
		System.out.println("a:"+a);
	}
	
	public static void sub(int b) {
		// b = b + 10; //  매개변수증가
		
		// this.b = b + 10; // 컴오류
			// 클래스메소드는 this 사용불가
		
		Test7.b = Test7.b + b;
	}
}
