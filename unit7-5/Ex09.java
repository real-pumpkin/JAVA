package ch07.unit05;

import java.util.Calendar;
import java.util.Date;

public class Ex09 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.printf("%tF\n", cal); // 2024-08-26
		
		/*
		  - java.sql.Date
		    : DB에 날짜를 저장하거나 DB에 저장된 날짜를 추출할때 사용
		    : yyyy-MM-dd 형식으로 출력 
		    : java.sql.Date를 사용하기 위해서는 JDK 9부터는 다음의 모듈을 추가해야 한다.
		      requires java.se;
		    : java.base 모듈
		      자바의 기본 모듈
		    : java.se 모듈
		      java.base, java.desktop, java.sql 등이 포함되어 있음
		*/
		
		// Calendar -> Date
		Date date = cal.getTime();
		System.out.println(date);

		// java.util.Date -> java.sql.Date
		java.sql.Date date2 = new java.sql.Date(date.getTime());
		System.out.println(date2);
		
		// java.util.Date -> Calendar
		cal.setTime(date);
		System.out.printf("%tF\n", cal);
	}
}
