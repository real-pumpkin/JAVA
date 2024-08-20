package ch06.unit02;

public class Ex01 {
	public static void main(String[] args) {
		// 일반 변수(지역 변수)
		int x;
		// System.out.println(x); // 컴오류. 초기화하지 않으면 연산 불가
		x = 50;
		System.out.println("x : " + x);
		
		// 객체
		// 1) 레퍼런스 변수 선언(객체 선언)
		Test1 t1;
		// t1.a = 100; // 컴파일 오류. 초기화 되지 않았으므로
		
		// 2) 메모리 할당
		//   객체 = new 생성자();
		//   객체를 생성할때는 new 다음에 생성자를 기술하여 생성한다.
		t1 = new Test1();
		
		// 3) 사용
		System.out.println(t1.a + " : " + t1.b + " : " + t1.name); // 0:10:null
		
		// 필드에 값 할당
		t1.name = "홍길동";
		t1.a = 20;
		
		// 메소드 호출
		t1.write(); // 홍길동:20:10
		
		// Test1 t2 = null;
		// System.out.println(t2.a); // 런타임오류(메모리가 할당되지 않음)
		
		// 객체 선언과 동시에 메모리 할당
		Test1 t2 = new Test1();
		t2.write(); // null:0:10
	}
}

// 클래스 : 데이터(필드) + 기능(메소드) 로 구성
class Test1 {
	// 필드 선언(인스턴스 변수)
	// 필드는 초기화 하지 않으면 객체가 생성되는 시점에 객체는 null,
	//		숫자변수는 0으로 초기화
	String name;	// null 로 초기화
	int a;			// 0 으로 초기화 
	int b = 10;
	
	// 메소드(인스턴스 메소드)
	public void write() {
		System.out.println(name + " : " + a + " : " + b);
	}
}
