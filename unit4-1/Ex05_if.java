package ch04.unit01;

import java.util.Scanner;

public class Ex05_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수를 입력 받아 2와 3의 배수, 또는 2의 배수, 또는 3의 배수인지 출력
		// 먼저해야하는 것 순서 정렬 
		int n;
		
		System.out.print("정수 : ");
		n=sc.nextInt();
		
		if(n%6 == 0) {
			System.out.println("2와 3의 배수 : " + n);
		} else if(n%2 == 0) {
			System.out.println("2의 배수 :" + n);
		} else if(n%3 == 0) {
			System.out.println("3의 배수 :" + n);
		} else {
			System.out.println("2, 3의 배수 아님");
		}
		sc.close();
	}
}
