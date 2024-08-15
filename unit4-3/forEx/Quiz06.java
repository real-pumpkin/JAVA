package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, min;
		
		// 가장 처음 입력 받은 값을 초기값으로
		/*
		min = 0;
		System.out.println("5개의 정수를 입력하세요.");
		for(int i=0; i<5; i++) {
			n = sc.nextInt();
			
			if(i == 0 || min > n) {
				min = n;
			}
		}
		System.out.println("최소값:"+min);
		*/

		// 가장 큰값을 초기값으로
		min = 0x7FFFFFFF;
		System.out.println("5개의 정수를 입력하세요.");
		for(int i=0; i<5; i++) {
			n = sc.nextInt();
			
			if(min > n) {
				min = n;
			}
		}
		System.out.println("최소값:"+min);
		
		sc.close();
	}

}
