package ch04.unit02;

import java.util.Scanner;

public class Ex05_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		
		System.out.print("코드[j1,j2,j3] ? ");
		s = sc.next();
		
		switch(s) {
		case "j1" : System.out.println("자바"); break;
		case "j2" : System.out.println("스프링"); break;
		case "j3" : System.out.println("오라클"); break;
		default : System.out.println("입력 오류"); break;
		}
		//if(s == "j1") {} // 잘못된 코딩
		sc.close();
	}
}
