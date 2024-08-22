package ch07.unit03;

public class Ex01 {

	public static void main(String[] args) {
		int a = 10, b;
		Integer obj = null; // Integer : int에 대응하는 Wrapper 클래스
		
		// 기본 자료형은 null을 가질 수 없지만
		//   Integer 등의 Wrapper 는 null을 가질 수 있다.
		
		obj = a; // 기본자료형이 Integer로 자동 형변환 : Auto-boxing
		b = obj; // Integer가 기본 자료형으로 형변환 : Auto-unboxing
		System.out.println(a+","+b+","+obj);
		
		System.out.println("정수 최대값 : " + Integer.MAX_VALUE);
		System.out.println("정수 최소값 : " + Integer.MIN_VALUE);
		System.out.println("int의 bit 수 : " + Integer.SIZE);
		System.out.println("int의 byte 수 : " + Integer.BYTES);
		
		

	}

}
