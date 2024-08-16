package ch04.unit05;

import java.util.Scanner;

public class Ex04_continue {

	public static void main(String[] args) {
		// 5 개의 홀수를 입력 받아 홀수 합 구하기
		// 단 입력 받은 수가 0이하이거나 짝수이면 재입력
		Scanner sc = new Scanner(System.in);
		
		int input, s;
		
		s = 0;
		System.out.println("5개의 정수 입력...");

		/*
		int n = 0;
		while(n < 5) {
			input = sc.nextInt();
			if(input < 0 || input % 2 == 0) {
				continue;
			}
			
			s += input;
			n++;
		}
		*/
		
		/*
		for(int i=0; i<5; i++) {
			input = sc.nextInt();
			if(input < 0 || input % 2 == 0) {
				i--;
				continue;
			}
			s += input;
		}
		*/
		
		for(int i=0; i<5; ) {
			input = sc.nextInt();
			if(input < 0 || input % 2 == 0) {
				continue;
			}
			s += input;
			i++;
		}
		
		System.out.println("결과:"+s);
		
		sc.close();
	}

}
