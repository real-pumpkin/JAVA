package ch08.unit03;

public class Ex05 {
	public static void main(String[] args) {
		Test5 t1 = new Test5();
		Demo5 d1 = new Demo5();
		
		System.out.println(t1.b+":"+d1.b); // 20:100
		t1.print(); // Test5의 t1 호출
		
		// Object > Test5 > Demo5
		// up-casting
		Test5 t2 = new Demo5();
		Test5 t3 = d1;
		Object o = new Demo5();
		
		System.out.println(t2.b); // 필드는 자기것. 없으면 상위 것
				// 20
		// System.out.println(t2.c); // 컴오류
		System.out.println(((Demo5)t3).c); // down-casting. 200
		System.out.println(((Demo5)o).c); // down-casting. 200
		
		t2.print(); // 메소드는 재정의된 하위 클래스 메소드 호출
					// 상위 메소드는 숨는다.
		// t2.write(); // 컴오류
		((Demo5)t2).write(); // down-casting
		
		// down casting
		// Demo5 dd = (Demo5)t1; // 런타임오류. 업한것만 다운가능
		if(t1 instanceof Demo5) {
			// instanceof 연산자 : 해당 클래스의 객체이면 true
			Demo5 dd = (Demo5)t1;
			System.out.println(dd);
		} else {
			System.out.println("Demo5의 객체가 아님");
		}
		
		// Demo5 d2 = t2; // 컴오류. 다운은 반드시 캐스팅
		Demo5 d2 = (Demo5)t2;
		System.out.println(d2.c);
		
		Test5 t4 = (Test5)o;
		System.out.println(t4.a+":"+t4.b);
		
		// Object > Test5 > Demo5 이므로
		System.out.println(o instanceof Test5); // true
		System.out.println(o instanceof Demo5); // true
		
		/*
		if(o instanceof Demo5) {
			Demo5 d3 = (Demo5)o;
			System.out.println(d3.a+":"+d3.b+":"+d3.c);
		}
		*/

		// instanceof 패턴 매칭 : JDK 16 정식 스팩
		if(o instanceof Demo5 d3) {
			System.out.println(d3.a+":"+d3.b+":"+d3.c);
		}
		
	}
}

class Test5 {
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a+":"+b);
	}
	
	public void disp() {
		System.out.println("disp...");
	}
}

class Demo5 extends Test5 {
	int b = 100;
	int c = 200;
	
	@Override
	public void print() {
		System.out.println(a+","+b+","+super.b+","+c);
	}
	
	public void write() {
		System.out.println("write...");
	}
}
