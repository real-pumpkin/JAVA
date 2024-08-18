package ch04.unit03.quiz;

import java.util.Scanner;

/*
	정수를 입력 받아 16진수로 변환하는 프로그램
*/
public class Quiz02_Hexadecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("정수 ? ");
		num = sc.nextInt();
		// System.out.printf("%X\n", num);

		String s = "";
		int mod;
		while (true) {
			mod = num % 16;
			if (mod < 10) {
				s = mod + s;
			} else {
				s = (char) (65 + (mod - 10)) + s;
			}

			num = num / 16;
			if (num == 0) {
				break;
			}
		}

		System.out.println("결과 : " + s);

		sc.close();
	}
}
