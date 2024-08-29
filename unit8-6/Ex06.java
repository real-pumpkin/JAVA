package ch08.unit06;

public class Ex06 {
	public static void main(String[] args) {
		int s = Demo6.sum(100);
		System.out.println("합 : " + s);
		
		Demo6 d = new DemoImpl6();
		int n = d.max(10, 5);
		d.write(n);
	}
}

interface Demo6 {
	public void write(int n);
	
	// static 메소드 : JDK 8부터 가능
	public static int sum(final int n) {
		int s = 0;
		for(int i=1; i<=n; i++) {
			s+=i;
		}
		return s;
	}
	
	// default 키워드를 이용하여 메소드 구현 가능 : JDK 8부터 가능
	//  구현클래스에서 재정의 가능
	public default int max(int m, int n) {
		return m > n ? m : n;
	}
}

class DemoImpl6 implements Demo6 {
	@Override
	public void write(int n) {
		System.out.println("결과 : " + n);
	}
}

