package ch07.unit09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex01 {

	public static void main(String[] args) {
		// 시스템 날짜
		LocalDate local = LocalDate.now();
		System.out.println(local);
		String s = local.toString();
		System.out.println("오늘:"+s);
		
		// 날짜 설정
		LocalDate local2 = LocalDate.of(2024, 8, 27);
		//LocalDate local2 = LocalDate.of(2024, 8, 32); // 런타임오류
		System.out.println(local2); // 2024-08-27
		
		// 시스템 시간
		LocalTime time = LocalTime.now();
		System.out.println("시스템시간:"+time); // 11:39:33.204594100
		
		// 시간 설정
		LocalTime time2 = LocalTime.of(11, 40, 0, 0);
		System.out.println(time2);
		
		// 시스템날짜와 시간
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		String[] ss = dateTime.toString().split("T");
		System.out.println(ss[0]+", "+ss[1]);
	}
}
