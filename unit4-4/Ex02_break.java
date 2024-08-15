package ch04.unit04;

import java.util.Scanner;

public class Ex02_break {

	public static void main(String[] args) {
		// 실수를 입력 받아 입력 받은 수의 합 구하기
		//  단, 입력 받은 수가 0 이하이면 합을 출력하고 종료
		Scanner sc = new Scanner(System.in);
		double s, n;
		
		s = 0;
		System.out.println("실수[종료:0]..");
		while(true) {
			n = sc.nextDouble();
			if(n <= 0) {
				break;
			}
			
			s+=n;
		}
		System.out.println("결과:"+s);
		sc.close();
	}

}
