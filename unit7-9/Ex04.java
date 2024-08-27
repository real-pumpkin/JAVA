package ch07.unit09;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ex04 {

	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.now();
		LocalDateTime end = LocalDateTime.of(2025,3,12,18,0,0);
		
		if(start.isBefore(end)) {
			System.out.println("진행중...");
		} else if(start.isEqual(end)) {
			System.out.println("종료함...");
		} else if(start.isAfter(end)) {
			System.out.println("종료했다.");
		}
		
		System.out.println(start.until(end, ChronoUnit.YEARS));
			// 남은 연도
		System.out.println(start.until(end, ChronoUnit.MONTHS));
			// 남은 월
		System.out.println(start.until(end, ChronoUnit.DAYS));
			// 남은 일
		
		long y = ChronoUnit.YEARS.between(start, end);
			// 남은 연도
		long m = ChronoUnit.MONTHS.between(start, end);
			// 남은 월
		long d = ChronoUnit.DAYS.between(start, end);
			// 남은 일
		System.out.println(y+","+m+","+d);
	}
}
