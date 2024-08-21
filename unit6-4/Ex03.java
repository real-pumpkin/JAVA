package ch06.unit04;

public class Ex03 {
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.disp();
		
		Test3 t2 = new Test3(10);
		t2.disp();
	}
}

class Test3 {
	private int a;
	
	public Test3() {
		System.out.println("인자 없는 생성자...");
	}
	
	public Test3(int n) {
		a = n;
		System.out.println("인자 하나인 생성자...");
	}
	
	public void disp() {
		System.out.println("a : " + a);
	}
}

