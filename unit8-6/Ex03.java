package ch08.unit06;

public class Ex03 {

	public static void main(String[] args) {
		Demo3 d = new Test3();
		d.disp();
	}
}

interface Demo3 {
	public void print();
	public void disp();
}

abstract class DemoImpl3 implements Demo3 {
	@Override
	public void disp() {
		System.out.println("disp...");
	}
}

class Test3 extends DemoImpl3 {

	@Override
	public void print() {
		System.out.println("print...");
	}
}

