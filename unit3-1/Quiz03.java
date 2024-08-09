package ch03.unit01;

public class Quiz03 {
	public static void main(String[] args) {
		int a;
		int b;
		
		a = 123456;
		
		// 1의자리버림 : 123450
		b = a / 10 * 10;
		System.out.println("결과 : " + b);
		
		// 1의자리반올림
		b = (a+5) / 10 * 10;
		System.out.println("결과 : " + b);

		double c,d;
		
		c = 123.4563;
		//소수점 3째자리에서 반올림하여 소수점 2자리만 출력
		System.out.printf(".2f\n", c);
		
		//소수점 3째자리에서 버리고 소수점 2자리까지만 출력
		d = (int)(c*100) / 100.; 
		System.out.println("결과 : " + d);
	}
}
