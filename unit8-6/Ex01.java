package ch08.unit06;

public class Ex01 {
	public static void main(String[] args) {
		// Demo1 dd = new Demo1(); // 컴오류.
			// 인터페이스는 추상클래스의 일종이므로 객체 생성 불가
		
		// 인터페이스는 구현클래스의 상위클래스와 유사하다.
		Demo1 d = new DemoImpl1(); // up-casting
		d.print();
		d.disp();
		
		//d.sub(); // 컴오류
			// 인터페이스에 sub() 메소드가 없음
		
		((DemoImpl1) d).sub(); // down-casting
		
		System.out.println(Demo1.A);
		
		// Demo1.B = 50; // 컴오류
			// 인터페이스의 필드는 final 이므로
	}
}

// 인터페이스 작성
interface Demo1 {
	// 인터페이스 필드는 public static final 만 가능
	public static final int A = 10;
	int B = 10; // 필드는 public static final 를 붙이지 않아도 public static final
	
	// 메소드는 public abstract 만 가능
	public abstract void disp(); // abstract 생략 가능
	void print(); // 메소드는 public abstract 이 없어도 public abstract
	
	// public void sub() { } // 컴오류.
}

// 인터페이스 구현
// 인터페이스를 구현한 클래스는 추상클래스가 아니면 인터페이스의 모든 추상메소드를 구현해야함
class DemoImpl1 implements Demo1 {

	@Override
	public void disp() {
		System.out.println("disp-인터페이스 메소드 재정의...");
	}

	@Override
	public void print() {
		System.out.println("print-인터페이스 메소드 재정의...");
	}
	
	public void sub() {
		System.out.println("sub...");
	}
}
