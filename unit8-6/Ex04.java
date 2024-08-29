package ch08.unit06;

public class Ex04 {
	public static void main(String[] args) {
		Cdemo4 d = new DemoImpl4();
		d.sub();
	}
}

interface Ademo4 {
	public void print();
}

interface Bdemo4 {
	public void disp();
}

// 인터페이스는 다른 인터페이스를 상속 받을 수 있으며,
//   인터페이스는 다중 상속도 지원.
interface Cdemo4 extends Ademo4, Bdemo4 {
	public void sub();
}

class DemoImpl4 implements Cdemo4 {

	@Override
	public void print() {
		System.out.println("print...");
	}

	@Override
	public void disp() {
		System.out.println("disp...");
	}

	@Override
	public void sub() {
		System.out.println("sub...");
	}
	
}
