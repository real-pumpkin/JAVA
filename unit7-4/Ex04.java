package ch07.unit04;

import java.util.Scanner;

/*
  - 이름을 입력 받아 김씨의 인원수를 출력
  - 입력 받은 값이 end, End, END 등이면 인원수를 출력 하고 종료
*/
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int count = 0;
		
		/*
		do {
			System.out.print("이름 ? ");
			name = sc.next();
			if(name.startsWith("김")) {
				count++;
			}
		} while(! name.equalsIgnoreCase("end"));
		*/
		
		while(true) {
			System.out.print("이름 ? ");
			name = sc.next();
			if(name.equalsIgnoreCase("end")) {
				break;
			}
			
			/*
			if(name.startsWith("김")) {
				count++;
			}*/
			if(name.charAt(0) == '김') {
				count++;
			}
			/*
			if(name.substring(0, 1).equals("김")) {
				count++;
			}*/
		}
		
		System.out.println("김씨 인원수 : " + count);
		
		sc.close();
	}

}
