package ch05.unit01;

public class Ex01 {

	public static void main(String[] args) {
		int [] num; // 배열 선언
		num = new int[5]; // 메모리 할당
			// 정수 5개를 저장할 수 있는 정수형 배열
		
		// int [] num = new int[5]; // 배열 선언 및 메모리 할당
		
		//System.out.println(num[0]); // 0, 숫자 배열은 0으로 초기화
		
		// 배열에 값 할당. 첨자는 "길이-1" 까지만 가능
		num[0] = 10; num[1] = 5; num[2] = 7; num[3] = 4; num[4] = 2;
		// num[5] = 3; // 런타임 오류. ArrayIndexOutOfBoundsException 발생
		
		int s = 0;
		for(int i=0; i<num.length; i++) {
			s += num[i];
		}
		System.out.println("결과:"+s);
	}

}
  