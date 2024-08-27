package ch07.unit09;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Ex03 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		LocalDateTime local = now
				.plusYears(1)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(4)
				.minusMinutes(5)
				.plusSeconds(5);
		
		System.out.println(now);
		System.out.println(local);
		
		LocalDateTime local2 = now.withYear(2025);
		System.out.println(local2);
		local2 = local2.withMonth(5);
		local2 = local2.withDayOfMonth(10);
		System.out.println(local2);
		
		// 년도 상대 변경
		LocalDateTime local3 = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("이번해의 첫일:"+ local3);
		
		local3 = now.with(
				TemporalAdjusters.next(DayOfWeek.TUESDAY));
		System.out.println(local3); // 다가오는 화요일
		local3 = now.with(
				TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY));
		System.out.println(local3); // 다가오는 화요일(오늘포함)
		
		local3 = now.with(
				TemporalAdjusters.previous(DayOfWeek.TUESDAY));
		System.out.println(local3); // 이전 화요일
	}

}
