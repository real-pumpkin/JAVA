package ch07.unit05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex07_Date {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		// 1970.1.1 0:0:0.0 를 기준으로 밀리초 단위로 환산하여 반환
		long t = date.getTime();
		System.out.println(t);
		
		Date date2 = new Date(1724648646503L);
		
		// date 객체의 날짜가 date2의 객체 값보다 이후 날짜인지 반환
		System.out.println(date.after(date2)); // true
		
		// SimpleDateFormat : Date -> String
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String str = sdf.format(date);
		System.out.println(str);
		
		// SimpleDateFormat : String -> Date
		str = "2003-10-10";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date3 = sdf2.parse(str);
			// System.out.println(date3);
			System.out.println(sdf.format(date3));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end...");
	}
}
