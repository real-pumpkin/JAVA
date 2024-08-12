package ch04.unit01;

public class Ex01 {

	public static void main(String[] args) {
		int n;
		String s;
		
		/*
		n = 10;
		if(n % 2 == 0) {
			s = "짝수";	
		}
		System.out.println(n + " -> " + s); 컴오류 s가 초기화 되지 않음
		*/
		n = 10;
		s = "홀수";
		if(n % 2 == 0) { //if((n&1) == 0) { -> 결과 동일
			s = "짝수";	
			System.out.println(n + " -> " + s); 
		}
		 //System.out.println(n + " -> " + s);  //{}밖에서는 컴오류
	}
}
