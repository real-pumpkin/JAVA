package ch07.unit05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex08 {

	public static void main(String[] args) {
		Date date = new Date();
		String s = "2003-10-10";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date2 = sdf.parse(s);
			
			long dif = (date.getTime() - date2.getTime()) / (1000 * 60 * 60 * 24);
			System.out.println("차이(일자) : " + dif);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
