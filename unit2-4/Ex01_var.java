package ch02.unit04;

public class Ex01_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// var : 자료형 추론(지역변수 유형 추론)
		
		// var a; // 컴파일 오류. 반드시 선언과 동시에 초기화
		var a = 10; // int
		int b = a;
		System.out.println(b);
		
		var s = "java"; // String 
		s = s + 10;
		System.out.println(s);
		
		
	}

}
