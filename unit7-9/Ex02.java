package ch07.unit09;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ex02 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		int y = now.getYear();
		int m = now.getMonthValue();
		int d = now.getDayOfMonth();
		DayOfWeek week = now.getDayOfWeek();
		String w = week.toString(); // 영어 요일
		int h = now.getHour();
		int mi = now.getMinute();
		int s = now.getSecond();
		int n = now.getNano();
		
		System.out.printf("%04d-%02d-%02d %02d:%02d:%02d.%d %s",
				y, m, d, h, mi, s, n, w);
		System.out.println();
		
		LocalDate localDate = now.toLocalDate();
		if(localDate.isLeapYear()) {
			System.out.println("윤년...");
		} else {
			System.out.println("평년...");
		}
		
		LocalDate localDate2 = LocalDate.of(2023, 3, 10);
		int diff = LocalDate.now().compareTo(localDate2);
			// 년도가 다르면 년도차이, 월이 다르면 월차이, 일이 다르면 일차이
		System.out.println(diff);
	}

}
