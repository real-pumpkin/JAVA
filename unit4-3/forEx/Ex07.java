package ch04.unit03.forEx;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 정수를 입력 받아 입력 받은 수까지 짝수합 구하기
		Scanner sc = new Scanner(System.in);
		
		int inputNum, s;
		
		// do {
			System.out.print("정수 ? ");
			inputNum = sc.nextInt();
		// } while(inputNum < 0);
		
		s = 0;
		for(int i=2; i<=inputNum; i+=2) {
			s += i;
		}
		System.out.println("결과 : " + s);
		
		sc.close();

	}

}
