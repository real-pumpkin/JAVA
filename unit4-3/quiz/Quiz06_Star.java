package ch04.unit03.quiz;

import java.util.Scanner;

/*
  // 홀수를 입력 받아 다이아몬드 모양을 출력하는 프로그램
  *
 ***
*****
 ***
  * 
*/
public class Quiz06_Star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size;
		int m;

		do {
			System.out.print("크기 ? ");
			size = sc.nextInt();
		} while (size < 1 || size > 10 || size % 2 == 0);

		m = size / 2;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < (size - m); j++) {
				System.out.print((j >= m) ? "*" : " ");
			}
			m = i < (size / 2) ? m - 1 : m + 1;
			System.out.println();
		}

		sc.close();
	}
}
