package ch09.unit02;

public class Ex08 {

	public static void main(String[] args) {
		// divide(10, 5);
		// divide(10, 0);
		divide(10, -5);
	}
	
	public static void divide(int a, int b) {
		try {
			if(b < 0) {
				System.out.println("음수를 입력했습니다.");
				// System.exit(0); // 프로그램 강제종료
				return;
			}
			
			int c = a / b;
			System.out.printf("%d / %d = %d\n", a, b, c);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누었습니다.");
		} finally {
			// System.exit(0); 를 이용하여 강제 종료한 경우만 실행 안함
			System.out.println("finally 블럭은 return을 만나도 실행");
		}
		System.out.println("end...");
	}

}
