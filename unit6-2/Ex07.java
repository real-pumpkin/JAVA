package ch06.unit02;

public class Ex07 {
	public static void main(String[] args) {
		/*
		Test7 t;
		t.name = "김자바"; // 컴파일오류. t가 초기화 되지 않았음
		*/
		
		/*
		Test7 t = null;	// null로 초기화. null은 메모리가 할당되지 않은 상태
		t.name = "김자바"; // 런타임오류. NullPointerException
		*/
		
		// 객체 배열
		Test7 []tt = new Test7[5];
		// Test7 t1=null, t2=null, t3=null, t4=null, t5=null; 과 유사 
		
		// tt[0].name = "홍길동"; // 런타임오류. NullPointerException
			// 클래스는 생성자를 통해서만 메모리 할당을 받는다.
		
		// 객체배열 메모리 할당
		for(int i=0; i<tt.length; i++) {
			tt[i] = new Test7();
		}
		
		tt[0].name = "홍길동";
		tt[0].age = 20;
		
		System.out.println(tt[0].name + ":" + tt[0].age);
		System.out.println(tt[1].name + ":" + tt[1].age);

		
	}
}

class Test7 {
	String name;
	int age;
	
	public void disp() {
		System.out.println(name + ":" + age);
	}
}
