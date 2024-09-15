package ch09.unit02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ss = new String[3];
		int idx = 0;
		String str;
		
		try {
			System.out.println("문자열 입력[종료:입력하지않고엔터]");
			while((str = sc.nextLine()).length() != 0) {
				ss[idx++] = str;
				System.out.print("문자열 : ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException 
			//  : 배열의 첨자가 벗어난 경우 발생하는 예외
			//  : unchecked exception
			idx--;
			System.out.println("입력을 초과 했습니다.");
		} finally {
			// 예외 발생 유무와 상관 없이 실행
			System.out.println("무조건 실행...");
			sc.close();
		}
		
		System.out.println("\n입력 문자열");
		for(int i=0; i<idx; i++) {
			System.out.println(ss[i]);
		}
		
		
	}
}


