package ch09.unit02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		User15 obj = new User15();
		
		obj.input();
		obj.input();
	}
}

class User15 {
	private Scanner sc = new Scanner(System.in);
	
	public void input() {
		String name, tel;
		int kor, eng, mat;
		
		try {
			System.out.print("이름 ? ");
			name = sc.nextLine();
			
			System.out.print("국어 ? ");
			kor = inputScore();
			
			System.out.print("영어 ? ");
			eng = inputScore();
			
			System.out.print("수학 ? ");
			mat = inputScore();
			
			System.out.print("전화번호 ? ");
			tel = sc.nextLine();
			
			System.out.println(name+":"+kor+":"+eng+":"+mat+":"+tel);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// System.out.println(e.toString());
		}
		
		System.out.println("--------------------");
		
		
	}
	
	// 점수를 입력 받는 메소드
	private int inputScore() throws Exception {
		int s = 0;
		
		try {
			s = sc.nextInt();
			sc.nextLine();
			if(s < 0 || s > 100) {
				throw new Exception("점수는 0~100 사이만 가능");
			}
		} catch (InputMismatchException e) {
			sc.nextLine();
			
			throw new Exception("숫자만 입력 해라.");
			//throw e;
		}
		
		return s;
	}
	
}

