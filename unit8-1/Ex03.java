package ch08.unit01;

public class Ex03 {
	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		obj.disp();
	}
}

/*
  - 하위클래스 객체를 생성하는 경우
    1) 상위클래스 필드의 메모리 할당, 기본값 초기화, 초기화수식실행
    2) 하위클래스 필드의 메모리 할당, 기본값 초기화, 초기화수식실행
    3) 상위클래스 초기화 블록 실행
    4) 상위클래스 생성자 몸체 실행
    5) 하위클래스 초기화 블록 실행
    6) 하위클래스 생성자 몸체 실행
*/
class Test3 {
	int a = 10;
	
	public Test3() {
		System.out.println("Test3 생성자...");
	}
	
	public void print() {
		System.out.println(a);
	}
}

class Demo3 extends Test3 {
	int x = 100;
	
	public Demo3() {
		super(); // 상위클래스의 생성자몸체실행
				// 최상단에 한번만 가능
				// 없으면 컴파일할때 super()를 추가하여 상위클래스의 인자없는 생성자호출
		
		System.out.println("Demo3 생성자...");
	}
	
	public void disp() {
		System.out.println(a+","+x);
	}
}
