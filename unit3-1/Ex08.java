package ch03.unit01;

public class Ex08 {
	public static void main(String[] args) {
	// 증감 연산자
		int a;
		
		a = 10;
		a++; // a = a + 1;
		System.out.println(a); // 11
		
		a = 10;
		++a;
		System.out.println(a); // 11
		
		a = 10;
		a--;
		System.out.println(a);
		
		char c = 'A';
		c++; // 형변환이 일어나지 않음
		System.out.println(c); // 'B'
		
	}
}
