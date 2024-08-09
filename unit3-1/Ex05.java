package ch03.unit01;

public class Ex05 {

	public static void main(String[] args) {
		char a, b;
		
		a = 'A';
		//b = a + 10;//컴오류
		b = (char)(a+10);
		System.out.println(b);
		
		a = 'A' + 10; // 리터널 연산은 형 변환이 일어나지 않음
		System.out.println(b);
	}
}
