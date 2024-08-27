package ch07.unit07;

import java.text.NumberFormat;

public class Ex02 {

	public static void main(String[] args) {
		String s1 = "1000";
		String s2 = "1,234";
		String s3 = "4567.12";
		int n;
		
		// n = Integer.parseInt(s2); // 런타임오류
		n = Integer.parseInt(s2.replaceAll(",", ""));
		System.out.println(n);
		System.out.println();
		
		// 문자열 -> 숫자
		NumberFormat nf = NumberFormat.getInstance();
		
		/*
		    Number : Integer, Long, Double 등 의 상위 클래스
		    Integer 나 Long, Double 는 상속관계가 아니므로 형변환 불가
		*/
		try {
			Number n1 = nf.parse(s1);
			Number n2 = nf.parse(s2);
			Number n3 = nf.parse(s3);
			
			System.out.println(n1); // 1000
			System.out.println(n2); // 1234
			System.out.println(n3); // 4567.12
			System.out.println();
			
			// System.out.println(n1 + n2); // 컴오류
			// System.out.println(n1 + 100); // 컴오류
			Integer a = 100;
			System.out.println(a + 50); // 150
			
			// Integer b = (Integer)n1; // 런타임오류
			
			// NumberFormat 의  parse() 로 변환하면
			//   정수는 Long, 실수는 Double 로 변환됨
			
			Long b = (Long)n1;
			System.out.println(b+10);
			
			Double c = (Double) n3;
			System.out.println(c);
			
			// 실수를 정수로 처리하도록 설정
			nf.setParseIntegerOnly(true);
			Number n4 = nf.parse(s3);
			System.out.println(n4); // 4567
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
