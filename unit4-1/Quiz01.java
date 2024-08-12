package ch04.unit01;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("첫번쨰 정수 입력 : ");
		a=sc.nextInt();
		System.out.print("두번쨰 정수 입력 : ");
		b=sc.nextInt();
		
		int c;
		if(a>b){
			c= a-b;
		}else {
			c= b-a;
			System.out.printf("두 수의 차이 : %d", c);
		}
	
		sc.close();
	}
}
