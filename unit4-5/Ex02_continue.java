package ch04.unit05;

import java.util.Scanner;

public class Ex02_continue {

	public static void main(String[] args) {
		// 5개의 실수를 입력 받아 입력 받은 수 중 양수의 합 구하기
		Scanner sc = new Scanner(System.in);
		double inputNum, s;
		
		s = 0;
		System.out.println("5개의 실수 입력...");
		for(int i=0; i<5; i++) {
			inputNum = sc.nextDouble();
			
			if(inputNum <=0.0) {
				continue;
			}
			
			s += inputNum;
		}
		
		System.out.println("결과:" + s);
		
		sc.close();
	}

}
