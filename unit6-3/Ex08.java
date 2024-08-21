package ch06.unit03;

public class Ex08 {
	public static void main(String[] args) {
		Test8 t = new Test8();
		t.write(5);
		System.out.println();
	}
}

class Test8 {
	// 재귀호출(recursion)
	//  : 재귀호출은 종료 조건을 주지 않으면 StackOverflowError이 발생
	//  : STACK에 정보를 임시 저장
	// STACK : LIFO 구조
	public void write(int n) {
		if(n > 1) {
			write(n-1);
		}
		
		System.out.print(n + " ");
	}
}
