package ch03.unit03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("두 정수?");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("a" +a+ ", b:" +b);
		
		
		int c;
		c=a; a=b; b=c;
		System.out.println("a" +a+ ", b:" +b);
		// a<-물, b<-우유
		
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		System.out.println("a" +a+ ", b:" +b);
		
		sc.close();
	}
}
