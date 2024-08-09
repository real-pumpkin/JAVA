package ch02.unit04;

import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자를 입력 받아 ASCII 코드 출력
		// scanner는 문자 못받음 문자열 받음.
		Scanner sc = new Scanner(System.in);
		char c;
		
		System.out.print("한문자 ? ");
		c = sc.next().charAt(0);
		
		int n = c;
		System.out.printf("%c -> %d\n", c, n);
			// 정수는 %c로 출력 불가
		System.out.printf("%c -> %d\n", c, (int)c);
		sc.close();
		
	}

}
