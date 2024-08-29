package ch08.unit06;

public class Ex02 {
	public static void main(String[] args) {
		DemoImpl2 d = new DemoImpl2();
		d.disp();
		d.print();
		d.sub();
		
		Ademo2 ad2 = new DemoImpl2(); // up-casting
		Bdemo2 bd2 = new DemoImpl2();
		
		// ad2.print(); // 컴파일
		((Bdemo2)ad2).print();
			// DemoImpl2는 Ademo2 와 Bdemo2 모두 구현되어 있으므로 가능
		
		((DemoImpl2)bd2).disp(); // down-casting
	}
}

interface Ademo2 {
	public void disp();
}

interface Bdemo2 {
	public void print();
}

// 클래스는 2개 이상의 인터페이스를 구현할 수 있다.
class DemoImpl2 implements Ademo2, Bdemo2 {

	@Override
	public void print() {
		System.out.println("Bdemo2 - print...");
	}

	@Override
	public void disp() {
		System.out.println("Ademo2 - disp...");
	}
	
	public void sub() {
		System.out.println("sub...");
	}
}



