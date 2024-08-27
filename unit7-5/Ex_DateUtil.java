package ch07.unit05;

import com.util.DateUtil;

public class Ex_DateUtil {

	public static void main(String[] args) {
		DateUtil util = new DateUtil();
		
		String s = "2003-02-29";
		boolean b = util.isVaildDate(s);
		System.out.println(b);

	}

}
