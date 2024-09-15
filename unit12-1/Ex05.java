package ch12.unit02;

import java.util.Arrays;
import java.util.List;

public class Ex05 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("자바", "오라클", "스프링",
				"자바", "안드로이드", "오라클");
		
		// 중복을 배제하여 출력하기
		for(int i = 0; i < list.size(); i++) {
			if(list.indexOf(list.get(i)) == i) {
				System.out.println(list.get(i));
			}
		}

	}

}
