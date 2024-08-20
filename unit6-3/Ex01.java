package ch06.unit03;

public class Ex01 {
	public static void main(String[] args) {
		Test1 t = new Test1();
		int result;
		
		result = t.sub(5);
		System.out.println(result);
		
		t.sub(10);
	}
}

// 메소드 : 기능을 구현
// 접근제어 리턴타입 메소드명([매개변수타입 매개변수명]) {}
// 지역변수(매개변수)는 메소드를 호출할때 메모리를할당받고 메소드를 빠져나갈때 메모리해제
class Test1 {
	public int sub(int n) { // n:매개변수(지역변수:스택메모리에 메모리할당)
		int s = 0; // s:지역변수(스택메모리에 메모리할당)
		
		s = n + 5;
		for(int i=0; i<s; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		return s; // 반환값을 가지고 호출한 곳으로 돌아감
		// System.out.println(s); // 컴오류. return 아래는 코딩 불가
	}
}
