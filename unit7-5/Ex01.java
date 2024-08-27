package ch07.unit05;

import java.util.Calendar;

/*
   - Calendar
     : 날짜와 시간을 객체 모델링한 클래스
     : 추상 클래스로 객체를 생성할수 없다.
     : 추상 클래스 - 미완성 클래스
*/
public class Ex01 {
	public static void main(String[] args) {
		// 현재 시스템 시간으로 Calendar 객체를 생성
		Calendar cal = Calendar.getInstance();
		
		// %tF:년-월-일, %tA:요일, %tT:시간
		String s = String.format("%tF %tA %tT", cal,cal,cal);
		System.out.println(s);
		
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH) + 1;
			// Calendar.MONTH : 0 ~ 11 반환
		int d = cal.get(Calendar.DATE);
		// int d2 = cal.get(Calendar.DAY_OF_MONTH); // DATE와 동일
		int w = cal.get(Calendar.DAY_OF_WEEK); 
			// 1(일), 2(월) ... , 7(토)
		int w2 = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
				// 현재 요일이 이 달의 몇번째 요일인지 반환
		
		System.out.println("년:"+y);
		System.out.println("월:"+m);
		System.out.println("일:"+d);
		System.out.println("요일:"+w);
		System.out.println("이 달의 몇번째 요일:"+w2);
		
		System.out.println("올해의현재주차:"+cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이달의현재주차:"+cal.get(Calendar.WEEK_OF_MONTH));
			// 월에 대하여 1~6주 반환
		
		System.out.println("오전/오후 ? " + cal.get(Calendar.AM_PM));
			//오전:0, 오후:1
		System.out.println("시간(0~11):" + cal.get(Calendar.HOUR));
		System.out.println("시간(0~23):" + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분:" + cal.get(Calendar.MINUTE));
		System.out.println("초:" + cal.get(Calendar.SECOND));
		System.out.println("1000/1초:"+cal.get(Calendar.MILLISECOND));
		
		System.out.println("이번달마지막일자는 : " + cal.getActualMaximum(Calendar.DATE));
		
		// 2024-12-25로 날짜 변경
		cal.set(2024, 12 - 1, 25);
		System.out.printf("%tF\n", cal);
		
		// 2024-09-33
		cal.set(Calendar.YEAR, 2024);
		cal.set(Calendar.MONTH, 9 - 1);
		cal.set(Calendar.DATE, 33);
		System.out.printf("%tF\n", cal); // 2024-10-03
		
		// 엄기은씨가 2024년 8월 10일 여자친구를 만났다. 100일후는 ?
		cal.set(2024, 8 - 1, 10);
		cal.add(Calendar.DATE, 100);
		System.out.printf("%tF\n", cal);
		
		// 1970년 1월 1일 0시 0분 0초를 기준으로 밀리초로 환산하여 반환(UTC)
		// UTC : 협정 세계시. UTC 에 +9를 해주면 한국시간
		long t = cal.getTimeInMillis();
		System.out.println(t);
	}
}
