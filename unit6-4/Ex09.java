package ch06.unit04;

public class Ex09 {

	public static void main(String[] args) {
		Test9 t1;
		
		// 클래스가로딩되는시점 : 객체를 처음생성하거나 클래스변수나 클래스메소드를 처음 사용할때
		System.out.println(Test9.x+":"+Test9.y);
		
		t1 = new Test9();
		t1.disp();

		Test9 t2 = new Test9();
		t2.disp();
		
	}
}

/*
  - 클래스가 로딩될 때 한번 실행
    1) 클래스변수 메모리 할당 - 메소드 영역
    2) 클래스 변수를 디폴트로 초기화
    3) 초기화 수식을 실행
    4) static 초기화 블록 실행

  - 객체가 생성될때 마다 실행
    1) new Test9();
       객체를 위한 메모리 할당 - 인스턴스변수 메모리할당
    2) 모든 인스턴스변수를 디폴트로 초기화
    3) 초기화 수식이 존재하는 경우 초기화 수식을 실행( b <- 1)
    4) 초기화 블록이 존재하면 실행
    5) 생성자 몸체를 실행
*/

class Test9 {
	private int a;
	private int b = 1;
	private int c;
	private int d;
	
	// d = 5; // 컴오류
	
	public static int x = 10;
	public static int y;
	
	static {
		y = 5;
		
		System.out.println("static 초기화 블록");
	}
	
	{
		// 인스턴스 초기화 블럭(사용할일이 거의 없음)
		d = 5;
		System.out.println("인스턴스 초기화 블럭");
	}
	
	public Test9() {
		c = 10;
		System.out.println("생성자...");
	}
	
	public void disp() {
		System.out.println(a + " : " + b + " : " + c + " : " + d);
	}
	
	
}
