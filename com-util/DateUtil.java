package com.util;

import java.util.Calendar;

public class DateUtil {
	/**
	 * 날짜 형식이 올바른지 여부를 판별
	 * 
	 * @param strDate  문자열의 날짜
	 * @return		 형식이 올바르면 true를 반환하고 그렇지 않으면 false 반환
	 */
	public boolean isVaildDate(String strDate) {
		
		try {
			if(strDate.length() != 8 && strDate.length() != 10) {
				return false;
			}
			
			strDate = strDate.replaceAll("(\\-|\\/|\\.)", "");
			if(strDate.length() != 8) {
				return false;
			}
			
			int y = Integer.parseInt(strDate.substring(0, 4));
			int m = Integer.parseInt(strDate.substring(4, 6));
			int d = Integer.parseInt(strDate.substring(6));
			
			Calendar cal = Calendar.getInstance();

			cal.set(y, m-1, d);
			
			int y1 = cal.get(Calendar.YEAR);
			int m1 = cal.get(Calendar.MONTH) + 1;
			int d1 = cal.get(Calendar.DATE);
			
			if(y != y1 || m != m1 || d != d1) {
				return false;
			}

		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
}
