package ch08.unit03;

public class Ex01 {
	public static void main(String[] args) {
		// 클래스의 형변환은 상속관계에서만 가능하다.
		// Integer a = 10;
		// Long b = a; // 컴오류
		// Long b = (Long)a;  // 컴오류
		
		Test1 t = new Test1();
		t.print(); // 10,20
		// System.out.println(t.c); // 컴오류. 하위클래스멤버접근불가
		
		/*
		   - Test1(상위) > Demo1(하위)
		   - up-casting
		      : 상위 클래스의 객체가 하위 클래스의 객체를 참조하는 것
		      : up casting 는 언제나 가능
		      : 형 변환을 하지 않아도 된다.
		 */
		Demo1 dm = new Demo1();
		Test1 t1 = dm; // up-casting, 실행시
		
		System.out.println(t1 == dm); // true. 참조영역이 같다.
		
		System.out.println(dm.b); // 100
		System.out.println(t1.b); // 20
			// 업캐스팅 객체라 할지라도 필드는 자기 자신것을 가르킴
		// System.out.println(t1.c); // 컴오류
		
		// 업케스팅 객체에서 제정의됨 메소드는 숨어버리기 때문에
		//   하위 클래스의 메소드가 호출된다.
		// 이곳에서 Test1 의 print() 를 호출할수 있는 방법은 없다.
		t1.print(); // 재정의된 메소드가 호출된다.
		System.out.println();
		t1.disp();
		
		// t1.write(); // 컴오류
	}
}

class Test1 {
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a + " : " + b);
	}
	
	public void disp() {
		System.out.println("disp...");
	}
}

class Demo1 extends Test1 {
	int b = 100;
	int c = 200;
	
	@Override // 메소드가 오버라이드 규칙에 맞는지 검증
	public void print() {
		System.out.println("a:"+a+",b:"+b+",super.b:"+super.b
				+",c:"+c);
	}
	
	public void write() {
		print();
		super.print();
		disp(); // super.disp();
	}
	
}