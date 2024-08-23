package ch07.unit04;

public class Ex12 {

	public static void main(String[] args) {
		String s;
		
		// 내부적으로 StringBuilder를 이용함
		s = "자바"
			+ ", 스프링"
			+ ", 오라클"
			+ ", HTML";
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder();
		sb.append("자바");
		sb.append(", 스프링");
		sb.append(", 오라클");
		sb.append(", HTML");
		System.out.println(sb);
		
		/*
		s = "자바";
		s += ", 스프링";
		s += ", 오라클";
		s += ", HTML"; // 성능이 매우 않좋음
		*/
		
		
	}

}
