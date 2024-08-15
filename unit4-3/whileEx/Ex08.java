package ch04.unit03.whileEx;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 정수를 입력 받아 1부터 입력 받은 수까지 합 구하기
		/*
		Scanner sc = new Scanner(System.in);
		int inputNum, n, s;
		
		System.out.print("수 ? ");
		inputNum = sc.nextInt();
		
		n = s = 0;
		while(n < inputNum) {
			n++;
			s+=n;
		}
		System.out.println("결과:" + s);
		sc.close();
		*/
		
		// 정수를 입력 받아 1부터 입력 받은 수까지 홀수합 구하기
		Scanner sc = new Scanner(System.in);
		int inputNum, n, s;
		
		System.out.print("수 ? ");
		inputNum = sc.nextInt();
		
		n = 1;
		s = 0;
		while(n <= inputNum) {
			s+=n;
			n+=2;
		}
		System.out.println("결과:" + s);
		sc.close();

	}

}
