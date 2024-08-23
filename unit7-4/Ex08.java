package ch07.unit04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/*
		 - 문자열을 입력 받아 abc로 시작하는 문자열의 개수 구하기
		 - 입력 받은 문자열이 end 이면 개수 출력 후 종료
		 - 영문자는 대소문자를 구분하지 않음
		 */
		
		Scanner sc = new Scanner(System.in);
		String s;
		int count = 0;
		
		while(true) {
			System.out.print("문자열[end:종료] ? ");
			s = sc.next();
			if(s.equalsIgnoreCase("end")) {
				break;
			}
			
			// 런타임오류가 발생할 가능성이 있음
			/*
			if(s.substring(0, 3).equalsIgnoreCase("abc")) {
				count++;
			}
			*/
			
			if(s.toLowerCase().indexOf("abc") == 0) {
				count++;
			}
		}
		
		System.out.println("abc로 시작하는 문자열 개수 :" + count) ;
		
		sc.close();
		
	}

}
