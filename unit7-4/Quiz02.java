package ch07.unit04;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 수식 입력 받아 연산하기
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.print("수식[3+4] ? ");
		s = sc.nextLine();
		
		s = s.replaceAll("\\s", "");
		
		if(! s.matches("^\\d+[\\+\\-\\*\\/]\\d+$")) {
			System.out.println("연산이 불가능합니다.");
			sc.close();
			return;
		}
		
		/*
		String []ss = s.split("[\\+\\-\\*\\/]");
		char op = s.charAt(ss[0].length());
		int n1 = Integer.parseInt(ss[0]);
		int n2 = Integer.parseInt(ss[1]);
		String result;
		
		result = switch(op) {
		case '+' -> String.format("%d + %d = %d", n1, n2, n1+n2);
		case '-' -> String.format("%d - %d = %d", n1, n2, n1-n2);
		case '*' -> String.format("%d * %d = %d", n1, n2, n1*n2);
		default -> String.format("%d / %d = %d", n1, n2, n1/n2);
		};
		System.out.println(result);
		*/
		
		for(String op : new String[] {"+","-","*","/"}) {
			int pos = s.indexOf(op);
			if(pos > 0) {
				int n1 = Integer.parseInt(s.substring(0, pos));
				int n2 = Integer.parseInt(s.substring(pos + 1));
				
				int result = 0;
				switch (op) {
				case "+": result = n1 + n2; break;
				case "-": result = n1 - n2; break;
				case "*": result = n1 * n2; break;
				case "/": result = n1 / n2; break;
				}
				
				System.out.printf("%s = %d\n", s, result);
				break;
			}
		}
		
		
		
		sc.close();

	}

}
