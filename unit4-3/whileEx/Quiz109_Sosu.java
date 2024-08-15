package ch04.unit03.whileEx;

import java.util.Scanner;

/*
	정수를 입력 받아 입력 받은 정수가 소수인지를 판별
*/
public class Quiz109_Sosu {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		System.out.print("정수 ? ");
		num = sc.nextInt();

		int n = 2;
		boolean b = true;
		while (n < num) {
			if (num % n == 0) {
				b = false;
				break;
			}
			n++;
		}

		if (b && num != 1) {
			System.out.println(num + " : 소수");
		} else {
			System.out.println(num + " : 소수가 아님");
		}

		/*
		int n = 1;
		while(n<num) {
			n++;
			if(num%n == 0)
				break;
		}
		if(n != num || num == 1) {
			System.out.println(num + " : 소수가 아님");
		} else {
			System.out.println(num + " : 소수");
		}
		*/
		sc.close();
	}
}
