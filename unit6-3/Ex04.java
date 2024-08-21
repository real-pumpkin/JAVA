package ch06.unit03;

public class Ex04 {
	public static void main(String[] args) {
		Test4 obj = new Test4();
		obj.disp();
		
		Test4.print();
	}
}

class Test4 {
	// 인스턴스변수
	int a;
	int b = 10;
	
	// 클래스변수
	static int c = 100;
	
	public int sub(int n) { // 인스턴스 메소드
		int s = 0;
		
		a = 100;
		s = n + 50;
		
		return s;
	}
	
	public void disp() { // 인스턴스 메소드
		System.out.println(a + ":" + b);
		
		int x = sub(5);
		System.out.println(x + ":" + a + ":" + b);
		
		write();
		System.out.println(c);
	}
	
	public static void write() { // 클래스 메소드
		System.out.println("write...");
	}
	
	public static void print() { // 클래스 메소드
		System.out.println(c);
		write();
		
		// System.out.println(a); // 컴오류
		// disp(); // 컴오류
		
		// 클래스메소드에서는 인스턴스변수나 인스턴스메소드를 호출하기 위해서는 객체를 생성해야함
		Test4 t = new Test4(); // 객체생성
		System.out.println(t.a);
		t.disp();
	}
}

