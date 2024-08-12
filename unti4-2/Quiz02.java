package ch04.unit02;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		String op;

		
		System.out.print("두 수 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("연산자 입력[+,-,*,/] : ");
		op = sc.next();
		
		/*
		switch(op) {
			case "+" : System.out.printf("%d + %d = %d", a,b,a+b); break; 
			case "-" : System.out.printf("%d - %d = %d", a,b,a-b); break; 
			case "*" : System.out.printf("%d * %d = %d", a,b,a*b); break; 
			case "/" : System.out.printf("%d / %d = %d", a,b,a/b); break; 
			default : System.out.println("연산자 입력 오류");
		}
		*/
		String s;
		switch(op) {
		case "+" : s = a+ "+" + b + "=" + (a+b); break;
		case "-" : s = a+ "-" + b + "=" + (a-b); break;
		case "*" : s = a+ "*" + b + "=" + (a*b); break;
		case "/" : s = a+ "/" + b + "=" + (a/b); break;
		default : s = "입력오류"; break;
		}
		System.out.println(s);
		
		sc.close();
	}
}
