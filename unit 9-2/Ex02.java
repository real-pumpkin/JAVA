package ch09.unit02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		try {
			// 1) 예외가 발생할 가능성이 있는 코드를 기술
			System.out.print("두정수 ? ");
			a = sc.nextInt();
			b = sc.nextInt();
			
			c = a / b;
			System.out.printf("%d / %d = %d\n", a, b, c);
			
		} catch (Exception e) {
			// Exception
			//   :모든 예외를 catch할수 있지만 
			//    예외상황별로 예외를 분리할수없다.
			
			// 2) 예외가 발생할때 실행할 코드
			System.out.println("예외 발생...");
		}
		
		// 3) 예외 발생 유무와 상관없이 실행
		System.out.println("end...");
		
		sc.close();
	}
}
