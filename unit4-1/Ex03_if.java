package ch04.unit01;

import java.util.Scanner;

public class Ex03_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		System.out.print("세개의 정수 ?"); // 10 5 7
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		System.out.printf("입력한 수 : %d %d %d\n", a, b, c);
		System.out.printf("크기 순 : %d %d %d\n", a, b, c);
		
		int t;
		if(a>b) {
			t=a; a=b; b=t;
		}
		if(a>c) {
			t=a; a=c; c=t;
		}
		if(b>c) {
			t=b; b=c; c=t;
		}
		System.out.printf("크기순 : %d %d %d\n",a,b,c);
		sc.close();
	}
}
