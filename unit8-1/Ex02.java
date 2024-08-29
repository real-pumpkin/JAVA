package ch08.unit01;

public class Ex02 {
	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.disp();
	}
}

class Test2 {
	int a = 10;
	int b = 20;
	
	public void print() {
		System.out.println(a+":"+b);
		// System.out.println(this.a+":"+this.b); // this 생략 가능
	}
}

class Demo2 extends Test2 {
	int b = 100;
	int x = 200;
	int y = 300;
	
	public void disp() {
		int x = 50;
		
		System.out.println("a:"+a); // super의 a
		System.out.println("this.a:"+this.a); // super의 a
		System.out.println("super.a:"+super.a); // super의 a
		
		System.out.println("b:"+b); // this의 b
		System.out.println("super.b:"+super.b); // super의 b
		
		System.out.println("x:"+x); // 지역변수 x
		System.out.println("this.x:"+this.x); // this의 x
		
		System.out.println("y:"+y); // this의 y
		System.out.println("this.y:"+this.y); // this의 y
		
		
	}
}
