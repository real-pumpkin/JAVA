package ch02.unit02;

/*
  - 이클립스
    실행 : ctrl + <F11>
 */

public class Ex01_Identifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "김자바"; //데이터타입, 식별자 = 김자바
		// String #subject = "자바"; // 컴파일오류. #은 식별자로 사용불가
		// String int; // 컴파일오류. 예약어는식별자로 사용불가
		String 주소 = "서울";
		String _tel = "010-0000-0000";
		int $age = 20;
		//int ~age = 10; // 컴파일 오류. ~는 사용불가
		int a = 10;
		//String a = "자바"; // 컴파일 오류. 동일한 이름으로 변수 다시선언 불가
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + 주소);
		System.out.println("전화 : " + _tel);
		System.out.println("나이 : " + $age);
		System.out.println("a : " + a);

	}

}
