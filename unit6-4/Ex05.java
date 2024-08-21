package ch06.unit04;

public class Ex05 {

	public static void main(String[] args) {
		Test5 t = new Test5();
		t.set(5);
		t.print(); // 10,105,5,100
		
		Test5 t2 = new Test5();
		t2.set(3);
		t2.print(); // 10,103,5,100

		Test5 t3 = new Test5();
		t3.print(); // 0,0,5,100
	}
}

class Test5 {
	private int a;
	private int b;
	private int c = 5;
	
	public void set(int b) {
		this.a = 10; // this:호출한 객체
		this.b = b + 100; // this.b : 호출한 객체의 b필드, b:매개변수
	}
	
	public void print() {
		int c = 100;
		System.out.println(this.a+","+this.b+","+this.c+","+c);
	}
}