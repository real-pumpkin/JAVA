package ch07.unit02;

public class Ex01 {

	public static void main(String[] args) {
		// Test1 클래스의 상위 클래스 : Object
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		Test1 t3 = t1;
		
		/*
		   - Object toString()
		     : "클래스이름@해쉬코드" 반환
		     : 다음 처럼 System.out.print() / println() 에서는
		       System.out.println(t1.toString())
		       System.out.println(t1) 는
		       동일하게 "클래스이름@해쉬코드" 가 출력
		*/
		System.out.println(t1.toString());
		System.out.println(t1);
		System.out.println();
		
		// 주소비교
		System.out.println(t1 == t2); // false
		System.out.println(t1.equals(t2)); // false
		System.out.println(t1 == t3); // true
		System.out.println(t1.equals(t3)); // true
		
		// 해쉬코드
		System.out.println(t1.hashCode()); // 10 진수
		System.out.printf("%h\n", t1.hashCode()); // 16진수
		System.out.printf("%x\n", t1.hashCode()); // 16진수
		
	}
}

class Test1 {
	int a = 10;
	int b = 20;
	
	public void disp() {
		System.out.println(a + " : " + b);
	}
}