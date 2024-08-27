package ch07.unit09;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex06 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2025, 10, 10);
		
		// 날짜 차이
		Period p = Period.between(date1, date2); // date2 - date1
		System.out.println("날짜1:"+date1);
		System.out.println("날짜2:"+date2);
		System.out.println("차이:"+p);
		
		System.out.println("년도차이:" + p.get(ChronoUnit.YEARS));
		System.out.println("월차이:" + p.get(ChronoUnit.MONTHS));
		System.out.println("일차이:" + p.get(ChronoUnit.DAYS));

	}

}
