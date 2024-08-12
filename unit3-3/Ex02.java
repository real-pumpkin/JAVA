package ch03.unit03;

public class Ex02 {
	public static void main(String[] args) {
		int a, b;
		
		a = 128;
		
		b = a <<3; // 2의 3승을 곱한것과 동일 * 8
		System.out.println(b); // 1024
		
		b = a >>3; //2의 3승을 나눈것과 동일 /8
		System.out.println(b); // 16
		
		
		a = -128;
		b = a<<3;
		System.out.println(b); // -1024
		
		b = a>>3; // 우측으로 이동하고 남는 왼쪽 자리는 부호로 채움
		System.out.println(b); // -16
		
		
		b = a >>>3; // 우측으로 이동하고 남는 왼쪽자리는 0 으로 채움
		System.out.println(b); // 
	}
}
