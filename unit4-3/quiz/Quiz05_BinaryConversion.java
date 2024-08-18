package ch04.unit03.quiz;

import java.util.Scanner;

/*
	정수를 입력 받아 2진수로 변환하는 프로그램
*/
public class Quiz05_BinaryConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.print("정수 ? ");
		num = sc.nextInt();

		System.out.printf("%1$d(%1$#X) => ", num);
		for (int i = 0; i < 32; i++) {
			if (i != 0 && i % 4 == 0)
				System.out.print(" ");
			System.out.printf("%c", (num << i & 0x80000000) != 0 ? '1' : '0');
		}
		System.out.println();
		sc.close();
	}
}
