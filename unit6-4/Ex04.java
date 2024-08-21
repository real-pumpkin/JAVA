package ch06.unit04;

public class Ex04 {
	public static void main(String[] args) {
		Test4 t = new Test4();
		
		t.set(5);
		t.disp(); // 10,0,200
		t.write(); // 10,0,5
	}
}

// 필드와 지역변수(매개변수)와 이름이 동일하면 지역변수(매개변수)가 우선 순위가 높다.
class Test4 {
	private int a;
	private int b;
	private int c = 5;
	
	public void set(int b) { // b:매개변수
		a = 10; // 필드
		b += 100; // 매개변수
	}
	
	public void disp() {
		int c = 200; // 지역변수
		System.out.println(a+","+b+","+c); // 필드,필드,지역변수
	}
	
	public void write() {
		System.out.println(a+","+b+","+c); // 필드,필드,필드
	}
}
