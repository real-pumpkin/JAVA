package ch03.unit05;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
	
		
		/*
		 * 한문자를 입력받아 입력 받은 문자가 소문자이면 대문자로 변환하고 대문자로 변환하여 출력
		   단, 입력받은 문자가 영문자가 아니면 그대로 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		char a,b;
	
		
		System.out.print(" 문자 입력 :");
		a=sc.next().charAt(0);
		
		b = a >= 'A' && a <= 'Z' ? (char)(a+32) : (a >= 'a' && a <='z' ? (char)(a-32) : a);
		System.out.printf("%c - >%c\n", a, b);
		

		sc.close();
		
	}
}
