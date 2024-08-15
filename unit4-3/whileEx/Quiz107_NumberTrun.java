package ch04.unit03.whileEx;

import java.util.Scanner;

/*		
	양의 정수를 입력 받아 입력 받은 정수를 뒤집어 출력
*/
public class Quiz107_NumberTrun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, temp;

		do {
			System.out.print("수 ? ");
			num1 = sc.nextInt();
		} while (num1 < 0);

		num2 = 0;
		temp = num1;
		while (temp > 0) {
			num2 *= 10;
			num2 += temp % 10;
			temp /= 10;
		}

		System.out.println("원래의 수 : " + num1);
		System.out.println("뒤집은 수 : " + num2);

		sc.close();
	}
}
