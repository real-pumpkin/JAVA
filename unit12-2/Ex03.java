package ch12.unit02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
  - ArrayList
    : List 구현 클래스, 동기화 지원 안함
    : 검색시 속도 빠름
    
  - LinkedList
    : List 구현 클래스, 동기화 지원 안함
    : 검색은 느림
    : 앞에서 추가하거나 삭제가 빈번한 경우 빠름
    : 중간에 추가하거나 삭제시 현저히 속도가 느림
*/

public class Ex03 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("자바");
		list1.add("오라클");
		list1.add("서블릿");
		System.out.print("ArrayList : ");
		disp(list1);
		
		List<String> list2 = new LinkedList<String>();
		list2.add("서울");
		list2.add("인천");
		list2.add("경기");
		System.out.print("\nLinkedList : ");
		disp(list1);

	}
	
	public static void disp(List<String> list) {
		for(String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

}
