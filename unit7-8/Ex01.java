package ch07.unit08;

import java.util.Arrays;
import java.util.Collections;

public class Ex01 {

	public static void main(String[] args) {
		// Arrays : 배열에 관련한 다영한 메소드 제공
		String s;
		
		String[] ss = {"서울","부산","대구","인천","광주",
				"대전","울산","세종"};
		
		s = Arrays.toString(ss);
			// 배열의 각 요소를 [값1, 값2...] 형식으로 문자열로 반환
		System.out.println(s);
		
		Arrays.sort(ss); // 오름차순
		System.out.println(Arrays.toString(ss));
		
		Arrays.sort(ss, Collections.reverseOrder()); // 내림차순
		System.out.println(Arrays.toString(ss));
		
		// Object [] oo = {"자바", 60, "스프링", 70};
		// Arrays.sort(oo); // 런타임오류. 서로다른 자료형이 존재

	}

}
