package ch08.unit01;

public class Ex04 {
	public static void main(String[] args) {

	}
}

class Test4 {
	int a;

	public Test4(int a) {
		this.a = a;
	}
	
	public void print() {
		System.out.println(a);
	}
}

class Demo4 extends Test4 {
	int x = 10;
	
	public Demo4() {
		// super(); // 컴오류. 상위클래스에 인자가 없는 생성자가 없음
		super(100);
	}
	
	public void disp() {
		System.out.println(x);
	}
}
