package ch05.unit02;

import java.util.Scanner;

/*
	홀수를 입력 받아 마방진을 완성하는 프로그램
	입력받은 수가 만약 짝수가 입력되거나 15을 초과하면 다시 입력 받는다.
*/
public class Quiz08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[][];
		int n;
		int row, col;

		do {
			System.out.print("홀수 ? ");
			n = sc.nextInt();
		} while (n % 2 == 0 || n > 15 || n < 1);

		arr = new int[n][n];

		row = 0;
		col = n / 2;

		for (int i = 1; i <= n * n; i++) {
			arr[row][col] = i;

			if (i % n == 0) {
				row++;
			} else {
				row--;
				col++;
			}

			if (row < 0) {
				row = n - 1;
			}
			if (col >= n) {
				col = 0;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}

		sc.close();
	}
}
