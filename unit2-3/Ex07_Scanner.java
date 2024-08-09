package ch02.unit03;

import java.util.Scanner;

public class Ex07_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 두 정수를 입력 받아 사칙연산 하기
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("두 정수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
		
		sc.close();
		
	}

}
