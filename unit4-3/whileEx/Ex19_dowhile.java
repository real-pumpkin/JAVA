package ch04.unit03.whileEx;

import java.util.Scanner;

public class Ex19_dowhile {

	public static void main(String[] args) {
		// 2~9 사이의 수를 입력 받아 구구단 출력
		// 단, 입력 받은 수가 2~9 사이의 수가 아니면 다시 입력
		
		Scanner sc = new Scanner(System.in);
		
		int dan;
		int n;
		
		do {
			System.out.print("단 ? ");
			dan = sc.nextInt();
		} while(dan<2||dan>9);
		
		n = 0;
		while(n<9) {
			n++;
			System.out.printf("%d * %d = %2d\n", dan, n, dan*n);
		}
		
		sc.close();

	}

}
