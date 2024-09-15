package ch09.unit02;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		try {
			System.out.print("두정수 ? ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a/ b;
			System.out.printf("%d / %d = %d\n", a, b, c);
		} finally {
			// finally 
			//   : catch 블럭이 없어도 사용 가능
			System.out.println("예외발생 유무와 상관없이 실행");
			sc.close();
		}

		// 예외가 발생하면 실행하지 않음
		System.out.println("end...");
		
	}

}
