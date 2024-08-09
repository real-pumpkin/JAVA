package ch02.unit04;

import java.util.Scanner;

public class Quiz_01 {
	public static void main(String[] args) {
		//10~200 사이의 정수를 입력받아 입력 받은 수(ASCII 코드)에 대한 문자 출력
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.print("코드 ?");
		a = sc.nextInt();
		
		System.out.printf("%d -> %c\n", a, a);
		

				
		
		sc.close();
		
		
		
	}
}
