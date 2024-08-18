package ch05.unit01;

public class Ex08 {

	public static void main(String[] args) {
		// 선언과 동시에 초기화
		int []a = new int[] { 2,4,6,8,10 };
		// int []a = new int[5] { 2,4,6,8,10 }; // 컴오류. 초기화 할때 크기 지정 불가
		
		// int []a = { 2,4,6,8,10 }; // 선언과 동시에 초기화 할경우에는 new int[] 생략가능
		
		/*
		 int [] a;
		 // a = {1,3,5,7,9}; // 컴파일 오류
		 a = new int[] {1,3,5,7,9};
		 */
		
		System.out.println("배열 요소의 개수 : " + a.length);
		
		int tot = 0;
		for(int n : a) {
			tot += n;
			System.out.print(n + " ");
		}
		System.out.println("\n합 : " + tot);

	}

}
