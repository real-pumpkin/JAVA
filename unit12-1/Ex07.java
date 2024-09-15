package ch12.unit02;

import java.util.Stack;

/*
  - Stack
    : LIFO 구조
    : Vector를 상속 받음
    : 주요 메소드
      push() : 스택에 데이터 추가
      pop() : top 요소 반환 후 삭제
      peek() : top 요소를 반환 후 삭제 하지 않음
*/

public class Ex07 {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		
		// 추가
		st.push("자바");
		st.push("오라클");
		st.push("HTML");
		st.push("CSS");
		
		while( ! st.empty() ) {
			String s = st.pop(); // top 위치 데이터 반환 후 삭제
			System.out.print(s + " ");
		}
		System.out.println();

	}

}
