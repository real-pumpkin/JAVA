package ch02.unit03;

import java.util.Scanner;

public class Ex05_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 데이터를 입력 받을수있는 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		String name;
		int age;
		char g;
		double h; 
		
		//문자열 입력 : 공백이 구분 기호로 공백은 입력 불가능
		System.out.print("이름 ? ");
		name = sc.next();
		
		//정수입력
		System.out.print("나이 ? ");
		age = sc.nextInt();
		
		//문자 입력 : 문자 입력은 불가능하여 문자열을 입력 받아 첫글자만 가져옴
		System.out.print("성별(남:M,여:F) ? ");
		g = sc.next().charAt(0);
		
		//실수 입력
		System.out.print("키 ? ");
		h = sc.nextDouble();
		
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("성별 :" + g);
		System.out.println("키 :" + h);
	
		sc.close(); // 모든 리소스는 사용후 닫아야한다.

		
	}

}
