package ch12.unit02;

import java.util.Iterator;
import java.util.Vector;

public class Ex06 {

	public static void main(String[] args) {
		// ArrayList : 동기화 지원 안함
		// Vector : 동기화 지원(멀티 스레드에서 안전)
		
		// List<String> list = new Vector<String>();
		Vector<String> list = new Vector<String>();
		
		System.out.println("벡터초기용량:" + list.capacity()); // 10
		
		list.add("a1");	list.add("a2");	list.add("a3");
		list.add("a4");	list.add("a5");	list.add("a6");
		list.add("a7");	list.add("a7");	list.add("a9");
		list.add("a10"); list.add("a11"); list.add("a12");
		list.add("a13"); list.add("a14"); list.add("a15");
		
		System.out.println("데이터 개수 : " + list.size()); // 15
		System.out.println("벡터용량:" + list.capacity()); // 20
			// 용령이 부족하면 10개씩 증가
		
		list.add(0, "korea");
		System.out.println(list);
		
		System.out.println("처음:"+list.get(0));
		System.out.println("처음:"+list.firstElement());
		
		System.out.println("마지막:"+list.get(list.size()-1));
		System.out.println("마지막:"+list.lastElement());
		
		list.set(0, "대한민국");
		System.out.println(list);
		
		int idx = list.indexOf("a7");
		System.out.println("a7 인덱스 : " + idx);
		
		System.out.println("전체-1");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("전체-2");
		for(String s: list) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("전체-3");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
		
		// 삭제
		list.remove(3);
		list.remove("a7");
		System.out.println(list);
		
		// 전체삭제
		list.clear();
		
		System.out.println("개수:"+list.size());
		System.out.println("용량:"+list.capacity());
		
		// 용량을 개수로 조정
		list.trimToSize();
		System.out.println("용량:"+list.capacity());
		
		
		
		
		
		

	}

}
