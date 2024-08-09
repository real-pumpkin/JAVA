package ch02.unit03;

/*
 	- System.out.println([인수]);
 	  : 인수의 내용을 출력 후 라인을 넘긴다.
 	  : 인수가 없는 경우 라인을 넘긴다.
 	  : ([]) : 중괄호 안에 []는 생략해도된다의 의미
 	  
 */

public class Ex02_println {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HTML 5"); 
		System.out.println("CSS 3");
		System.out.println(); // 라인을 넘긴다 = print("\n");과 동일
		
		System.out.println("JAVA\n"); 		
		System.out.println("ORACLE"); 		
		System.out.println();

		System.out.println("국어\t영어\t수학");
		//System.out.println("80\t90\t100");
		System.out.println(80 + "\t" + 90 + "\t" + 100);		

	}

}
