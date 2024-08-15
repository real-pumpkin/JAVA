package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		// 5개의 정수를 입력 받아 7에 가장 가까운 정수
		Scanner sc = new Scanner(System.in);
		int n, diff, min = 0, result = 0;
		
		System.out.println("5개의 정수를 입력...");
		for(int i=0; i<5; i++) {
			n = sc.nextInt();
			
			diff = n > 7 ? n-7 : 7-n;
			
			if(i==0||min>diff) {
				min = diff;
				result = n;
			}
		}
		
		System.out.println("7에 가장 가까운 수 : " + result);
		sc.close();
	}

}
