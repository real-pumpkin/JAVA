package ch09.unit02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 잘못 작성한 코드
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("두정수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a / b;
		System.out.printf("%d / %d = %d\n", a, b, c);

		// 위에서 문제가 발생하면 실행 안됨
		System.out.println("end...");
		
		sc.close();
	}
}
