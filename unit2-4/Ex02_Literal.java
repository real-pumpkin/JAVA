package ch02.unit04;

public class Ex02_Literal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0b1100; // 2진수, 12
		// a = 0b1201; // 컴파일 오류
		System.out.println(a); // 12
		
		a = 01100; // 가장 앞에 0이 있으면 8진수
		System.out.println(a); // 576
		
		a = 1100; // 10진수
		System.out.println(a); // 1100
		
		a= 0x1100; // 16진수
		System.out.println(a); // 4352
		a= 0xA0;
		System.out.println(a); // 160
		// a = 0xG0; // 컴파일 오류, G는 없음
		
		a = 3_320;
		System.out.println(a); //3320
		
		long b;
		b = 120L;
		System.out.println(b);
		
		// a=b; //컴오류. 큰자료형을 작은 자료형에 대입 불가
	}

}
