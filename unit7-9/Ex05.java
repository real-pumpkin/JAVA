package ch07.unit09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex05 {

	public static void main(String[] args) {
		DateTimeFormatter dtf;
		LocalDate local;
		String s;
		
		// 문자열 -> LocalDate
		local = LocalDate.parse("2024-05-21");
		System.out.println(local);
		
		dtf = DateTimeFormatter.ISO_LOCAL_DATE;
		local = LocalDate.parse("2024-05-21", dtf);
		System.out.println(local);
		
		// local = LocalDate.parse("2024/05/21"); // 런타임오류
		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		local = LocalDate.parse("2024/05/21", dtf);
		System.out.println(local);
		
		// LocalDate -> String
		local = LocalDate.now();
		s = local.toString();
		System.out.println(s);
		
		dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		s = local.format(dtf);
		System.out.println(s);
		
		LocalDateTime now = LocalDateTime.now();
		dtf = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		s = now.format(dtf);
		System.out.println(s);
	}

}
