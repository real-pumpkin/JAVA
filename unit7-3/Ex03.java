package ch07.unit03;

public class Ex03 {

	public static void main(String[] args) {
		long a = 10;
		Long b = a;
		
		// Long c = 100; // 컴오류
		Long c = 100L;
		
		int x = (int)a; // long -> int로 강제 casting
		
		// 객체는 상속 관계에서만 형변환이 가능하다.
		// Integer와 Long는 상속 관계가 아니므로 형변환이 불가능하다.
		// Integer y = (Integer)b; // 컴오류
		
		Integer n = 10;
		long m = n; // 가능
		
		System.out.println(a+","+b+","+c+","+x+","+m);
	}

}
