package ch04.unit03.whileEx;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 정수를 입력 받아 입력 받은 수의 구구단 출력
		// 단 ? 2
		// 2 * 1 = 2
		//   :
		// 2 * 9 = 18
		Scanner sc = new Scanner(System.in);
		int n, dan;
		
		System.out.print("단 ? ");
		dan = sc.nextInt();
		
		n = 0;
		while(n < 9) {
			n++;
			System.out.printf("%d * %d = %d\n", dan, n, dan * n);
		}
		
		sc.close();

	}

}
