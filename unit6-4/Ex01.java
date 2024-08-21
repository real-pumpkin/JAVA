package ch06.unit04;

/*
    - Test1 t = new Test1();
      1) new 연산자로 인하여 객체가 메모리 할당 받는다.
         : a 필드가 heap 영역에 메모리 할당
         : 인스턴스변수의 메모리 할당
      2) a 필드는 디폴트 값(0)으로 초기화
      3) 생성자 몸체를 실행하여 a를 10으로 초기화 한다.
         : 생성자 몸체는 객체가 생성될때 객체마다 단 한번 실행한다.
*/

public class Ex01 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.disp();
	}
}

class Test1 {
	private int a;
	
	public Test1() {
		a = 10;
		System.out.println("생성자...");
	}
	
	public void disp() {
		// Test1(); // 컴오류. 생성자는 일반 메소드 처럼 호출 불가
		
		System.out.println("a:" + a);
	}
	
	
}
