package ch03.unit05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수를 입력 받아 양수, 영, 음수인지 판별
		int a;
		String s;
		
		System.out.print("정수 ? ");
		a = sc.nextInt();
		
		s = a>0?"양수":(a==0? "영":"음수");
		System.out.printf("%d : %s\n", a, s);
		
		sc.close();
			
	}
}
