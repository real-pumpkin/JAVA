package ch04.unit01;

import java.util.Scanner;

public class Ex04_if {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		
		System.out.print("문자 ? ");
		c = sc.next().charAt(0);
		
		if(c>= 'A' && c <= 'Z') {
			System.out.println(c + " : 대문자");
		}else if(c>='a' && c<='z'){
			System.out.println(c + " : 소문자");
		} else {
			System.out.println(c + " : 영문자가 아님");
		}
		sc.close();
	}
}
