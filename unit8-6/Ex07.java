package ch08.unit06;

public class Ex07 {
	public static void main(String[] args) {
		// 인터페이스의 익명 구현
		Demo7 d = new Demo7() {
			@Override
			public void disp() {
				System.out.println("disp...");
			}
		};
		
		d.disp();
		
	}
}

interface Demo7 {
	public void disp();
}

