package ch08.unit02;

public class Ex01 {
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		
		obj.print(); // super의 print()
		obj.disp(); // Deom1의 disp
	}
}

class Test1 {
	int a = 10;
	
	public void disp() {
		System.out.println("a:" + a);
	}
	
	public void print() {
		System.out.println(a);
	}
}

class Demo1 extends Test1 {
	int x = 100;
	
	// override : 메소드의 시그너처가 동일해야 한다.
	//			: 상속관계이어야 한다.
	public void disp() { // override
		System.out.println(a + ":" + x);
	}
	
	public void sub() {
		super.disp(); // Test1의 disp() 호출
	}
}
