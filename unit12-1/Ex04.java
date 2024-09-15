package ch12.unit02;

import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
		// 불변 Collection : JDK 9 이상
		List<String> list = List.of("서울", "인천", "경기");
		System.out.println(list);
		
		//list.add("강원"); // 런타임(UnsupportedOperationException)
		// list.set(0, "SEOUL"); // 런타임(UnsupportedOperationException)
	}

}
