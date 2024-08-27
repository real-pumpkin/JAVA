package ch07.unit05;

import java.util.Calendar;

public class Ex03 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		// 2024-07-30
		cal.set(2024, 7-1, 30);
		cal.getTime();
		System.out.printf("%tF %tA\n", cal, cal);
		
		int n;
		// 복제 : 객체는 다른 객체이지만 객체의 필드값을 복제
		Calendar cal2 = (Calendar)cal.clone();
		// System.out.printf("%tF %tA\n", cal2, cal2);
		// System.out.println(cal == cal2); // false
		n = cal.get(Calendar.DAY_OF_WEEK);
		cal2.add(Calendar.DAY_OF_MONTH, -(n-1));
		System.out.printf("주시작 : %tF %tA\n", cal2, cal2);
		
		/*
		Calendar cal3 = (Calendar)cal.clone();
		n = cal.get(Calendar.DAY_OF_WEEK);
		cal3.add(Calendar.DAY_OF_MONTH, (7-n));
		System.out.printf("주마지막 : %tF %tA\n", cal3, cal3);
		*/
		
		Calendar cal3 = (Calendar)cal.clone();
		cal3.set(Calendar.DAY_OF_WEEK, 7);
		cal3.getTime();
		System.out.printf("주마지막 : %tF %tA\n", cal3, cal3);
	}

}
