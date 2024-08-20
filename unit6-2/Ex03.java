package ch06.unit02;

public class Ex03 {
	public static void main(String[] args) {
		// 필드(인스턴스변수)는 new 한 객체 만큼 메모리를 할당 받는다. 
		Test3 t1 = new Test3();
		Test3 t2 = new Test3();
		Test3 t3 = new Test3();
		Test3 t4 = t1;
		
		t1.b = 20;
		
		System.out.println(t1.a + ":" + t1.b); // 10:20
		System.out.println(t2.a + ":" + t2.b); // 10:0
		System.out.println(t3.a + ":" + t3.b); // 10:0
		
		System.out.println(t1 == t4); // 주소비교. true / 동일한 주소
		System.out.println(t2 == t3); // false
		
		t4.a = 100;
		System.out.println(t1.a + ":" + t4.a); // 100:100
		
		// 클래스명@해쉬코드
		// 해쉬코드: JVM 에서 객체를 빠르게 검색하기 위해 사용
		// 같은객체는 해쉬코드가 같지만 해쉬코드가 같다고 같은객체는 아니다.
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
	}
}

class Test3 {
	int a = 10;
	int b;
	
	public void print() {
		System.out.println(a + ":" + b);
	}
}