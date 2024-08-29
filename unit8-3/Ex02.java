package ch08.unit03;

public class Ex02 {
	public static void main(String[] args) {
		// up-casting
		Test2 t = new Demo2();
		// t.write(); // 컴오류
		
		/*
		  - up-casting
		    : 상위 클래스의 객체가 하위 클래스의 객체를 참조하는 것
		    : up-casting 은 언제나 가능
		    : 형 변환 하지 않아도 된다.
		    
		  - down-casting
		    : up-casting 한 객체를 원래 객체로 캐스팅하는 것
		    : up-casting 한 객체만 down-casting 가능
		    : down-casting은 반드시 강제 캐스팅 해야 한다.
		*/
		
		// down-casting
		Demo2 dm = (Demo2)t;
		dm.write();
		
		// (Demo2)t.write(); // 컴오류
		((Demo2)t).write(); // down-casting
		
		/*
		Test2 t2 = new Test2();
		Demo2 dm2 = (Demo2)t2; // 런타임오류. up 한것만 down 가능
		dm2.write();
		*/
	}
}

class Test2 {
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a+","+b);
	}
	
	public void disp() {
		System.out.println("disp...");
	}
}

class Demo2 extends Test2 {
	int b = 100;
	int c = 200;
	
	public void print() {
		System.out.println(a+":"+b+":"+super.b+":"+c);
	}
	
	public void write() {
		System.out.println("write...");
	}
}

