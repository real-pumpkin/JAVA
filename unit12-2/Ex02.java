package ch12.unit02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("서울");
		list1.add("부산");
		list1.add("대구");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("강원");
		list2.add("경기");
		list2.add("경상");
		
		// list2에 list1의 모든 데이터를 추가
		list2.addAll(list1);
		System.out.println(list2);
		
		// List => 배열
		String[] ss = list2.toArray(new String[list2.size()]);
		System.out.println("리스트를 배열로");
		System.out.println(Arrays.toString(ss));
		
		// 배열 => List
		List<String> list3 = Arrays.asList(ss);
		System.out.println("배열을 리스트로 : " + list3);
		
		//System.out.println(list2.getClass().getName()); // ArrayList
		//System.out.println(list3.getClass().getName()); // Arrays$ArrayList
		
		// subList(a, b) : a 인덱스에서 b-1인덱스까지의 부분 인덱스
		List<String> list4 = list2.subList(1, 4);
		System.out.println(list4);
		
		// 전체 삭제
		list1.clear();
		System.out.println("삭제후:" +  list1.size());
		
		// list2에서 [경상, 서울, 부산] 삭제
		list2.subList(2, 5).clear();
		System.out.println("삭제후:" +  list2);
	}

}
