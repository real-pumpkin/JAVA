package ch03.unit03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		String s;
		
		System.out.printf("정수 ?");
		n = sc.nextInt();
		
		// s = n % 2 == 0 ? "짝" : "홀";
		s = (n & 1) == 1 ? "홀수" : "짝수";// 연산자 우선순위 떄문에 (), 안하면 오류
		System.out.println(n + "->" + s);
		
		sc.close();
	}
}
