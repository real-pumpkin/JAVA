package ch04.unit03.whileEx;

import java.util.Scanner;

/*
	0부터 입력 받은 개수만큼의 피보나치수열을 출력
*/
public class Quiz104_Fibonacci {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, c, n;
		int cnt;

		System.out.print("개수 ? ");
		cnt = sc.nextInt();

		n = 0;
		a = 0;
		b = 1;
		while (n < cnt) {
			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
			n++;
		}

		sc.close();
	}
}
