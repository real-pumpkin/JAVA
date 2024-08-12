package ch04.unit02;

import java.util.Scanner;

public class Ex04_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("수? ");
		n=sc.nextInt();
		
		// default : case 조건을 만족하지 않는 경우 실행. 위치는 상관 없음
		switch(n) {
			case 3 : System.out.println("***"); break;
			case 2 : System.out.println("**"); break;
			case 1 : System.out.println("*"); break;
			default : System.out.println("입력 에러"); break;
		}
		
		sc.close();
	}
}
