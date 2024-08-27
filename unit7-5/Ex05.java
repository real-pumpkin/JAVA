package ch07.unit05;

import java.util.Calendar;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 날짜를 입력 받아 요일구하기
		Scanner sc = new Scanner(System.in);
		String inputDate;
		
		do {
			System.out.print("날짜[yyyy-mm-dd] ? ");
			inputDate = sc.next(); // 2024-10-10
		} while( ! inputDate.matches("^(\\d{4}-\\d{2}-\\d{2})$"));
		
		String [] ss = inputDate.split("-");
		int y = Integer.parseInt(ss[0]);
		int m = Integer.parseInt(ss[1]);
		int d = Integer.parseInt(ss[2]);
		
		Calendar cal = Calendar.getInstance();
		cal.set(y,  m-1, d);
		System.out.printf("%tF %tA\n", cal, cal);
		
		sc.close();
	}

}
