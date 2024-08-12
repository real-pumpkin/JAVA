package ch03.unit05;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		/*
		 * 년도와 월을 입력 받아 윤년인지 평년인지 출력하기
		   년도가 4의 배수이고 100의 배수가 아니거나 400의 배수이면 윤년이며 그렇지 않으면 평년
		   년도 ? 2024
		   2024 : 윤년
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		String s;
		System.out.print("년도 입력 : ");
		year=sc.nextInt();
		
		s = year%4 == 0 && year%100 != 0 || year%400 == 0 ? "윤년" : "평년";
		
		
		System.out.printf("%d -? %s\n", year,s);
	
		sc.close();
	}
}
