package ch04.unit01;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char op;
		int a, b, result;
		
		System.out.print("두수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("연산자 ? ");
		op = sc.next().charAt(0);
		
		if(op == '+' || op == '-'|| op =='*' || op == '/') {
			if(op == '+') {
				result = a+b;
			}else if(op=='-') {
				result = a-b;
			}else if(op=='*') {
				result = a*b;
			}else {
				result = a/b;
			}
			System.out.printf("%d %c %d = %d\n", a, op, b, result);
		} else {
			System.out.println("연산자 입력 오류 입니다.");
		}
		
		sc.close();
		

	}
}
