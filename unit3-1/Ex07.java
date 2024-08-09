package ch03.unit01;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		/*
		 - 반지름을 입력받아 원의 넓이와 둘레계산 
		 넓이 = 반 * 반 * 3.141592
		 둘레 = 반 * 2 * 3.141592
		 */
		Scanner sc = new Scanner(System.in);
		
		int a ;
		double b, c;
		double PI = 3.141592;
		
		System.out.println("반지름은?");
		a=sc.nextInt();
		
		b= a * a * PI;
		c= a * 2 * PI;
		
		System.out.println("넓이" + b);
		System.out.println("둘레" + c);
		
		sc.close();
	}
}
