package ch12.unit02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
  - List 인터페이스 
    : 순서가 있다. 배열과 유사한 구조. 인덱스
    : 가변 길이(저장공간이 부족하면 자동으로 공간이 늘어남)
    : 중복적인 요소도 추가 가능
    : 중간에 데이터를 추가하거나 삭제 가능
    : 구현클래스-ArrayList, LinkedList, Vector 등
    : 동시성-Vector, 멀티 스레드 환경에서 안전
    : 동시성지원안함-ArrayList, LinkedList - 멀티 스레드 환경에서 안전하지 않음 
*/
public class Ex01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // up casting
		String s;
		
		// 마지막에 요소 추가
		list.add("서울");
		list.add("부산");
		list.add("인천");
		list.add("광주");
		list.add("서울"); // 중복적인 요소도 추가 가능
		list.add("대전");
		System.out.println(list);
		
		// 2 인덱스에 데이터 추가
		list.add(2, "대구");
		System.out.println(list);
		
		// 데이터 개수
		System.out.println("개수 : " + list.size());

		// 처음 데이터 반환
		s = list.get(0);
		System.out.println("처음 : " + s);
		
		// 두번째 데이터 반환
		s = list.get(1);
		System.out.println("두번째 : " + s);
		
		// 마지막 데이터 반환
		s = list.get(list.size() - 1);
		System.out.println("마지막 : " + s);
		
		// 처음에 한국 추가
		list.add(0, "한국");
		System.out.println(list);
		
		int idx;
		// 인천의 인덱스 ?
		idx = list.indexOf("인천");
		System.out.println("인천 인덱스 : " + idx);
		
		// 세종의 인덱스 ?
		idx = list.indexOf("세종"); // -1 : 없으면
		System.out.println("세종 인덱스 : " + idx);
		
		// 서울의 인덱스 ?
		idx = list.indexOf("서울");
		System.out.println("서울(처음부터) : " + idx);
		
		idx = list.lastIndexOf("서울");
		System.out.println("서울(마지막부터) : " + idx);
		
		// 한국을 대한민국으로 수정
		list.set(0, "대한민국");
		System.out.println(list);
		
		// 대한민국 삭제
		// list.remove("대한민국");
		list.remove(0);
		System.out.println(list);
		
		// 부산 존재 여부
		System.out.println(list.contains("부산"));
		
		System.out.println("전체출력-1");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + "  ");
		}
		System.out.println();
		
		System.out.println("전체출력-2");
		for(String str : list) {
			System.out.print(str + "  ");
		}
		System.out.println();
		
		System.out.println("전체출력-3");
		Iterator<String> it = list.iterator(); // 반복자
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str + "  ");
		}
		System.out.println();
		
		System.out.println("역순-1");
		for(int i=list.size()-1; i>=0; i--) {
			System.out.print(list.get(i) + "  ");
		}
		System.out.println();
		
		System.out.println("역순-2");
		// ListIterator<String> it2 = list.listIterator(); // 순방향
		ListIterator<String> it2 = list.listIterator(list.size()); // 역방향
		while(it2.hasPrevious()) {
			String str = it2.previous();
			System.out.print(str + " ");
		}
		System.out.println();
		
		// 모두 지우기
		list.clear();
		
		System.out.println("모두 삭제후 개수 : " + list.size());
	}
}
