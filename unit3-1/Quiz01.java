package ch03.unit01;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, h, m, s;
		
		System.out.println("초를 입력?");
		a = sc.nextInt();
		
		h = a / 3600; // 시간
		m = (a / 60) % 60; // 분
		s = a % 60; // 초
		
		System.out.printf("%d 초는 %d시간 %d분 %d 초입니다. \n", a, h ,m ,s);
		
		sc.close();
		
	}
}
