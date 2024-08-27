package ch07.unit05;

import java.util.Calendar;
import java.util.Scanner;

public class Ex04_Calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		String[] week = {"일","월","화","수","목","금","토"};
		int y, m, w, lastDay;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();
		
		do {
			System.out.print("월 ? ");
			m = sc.nextInt();
		} while(m < 1 || m > 12);
		
		// 날짜를 y년 m월 1일로 설정
		cal.set(y, m-1, 1);
		w = cal.get(Calendar.DAY_OF_WEEK);
		lastDay = cal.getActualMaximum(Calendar.DATE);
		
		System.out.println("\t" + y +"년 " + m + "월");
		for(String s : week) {
			System.out.printf("%4s", s);
		}
		System.out.println();
		System.out.println("------------------------------");
		
		for(int i=1; i<w; i++) {
			System.out.print("    ");
		}
		
		for(int i=1; i<=lastDay; i++) {
			System.out.printf("%4d", i);
			if(++w % 7 == 1) {
				System.out.println();
			}
		}
		if(w % 7 != 1) {
			System.out.println();
		}
		System.out.println("------------------------------");
		
		sc.close();
				

	}

}
