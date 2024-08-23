package ch07.unit04;

public class Ex06 {

	public static void main(String[] args) {
		String p, s;
		
		p = "\\d{1,3}"; // 1~3자 이내의 숫자
		s = "123";
		System.out.println(s.matches(p)); // 패턴이 일치하면 true
		
		s = "1234";
		System.out.println(s.matches(p)); // false
		
		// 한자 이상의 한글만 가능
		// ^:시작, $:끝, +:하나이상
		p = "^[가-힣]+$"; // 한자 이상의 한글만 가능
		s = "김자바";
		System.out.println(s.matches(p)); // true
		s = "김ㅎ바";
		System.out.println(s.matches(p)); // false
		
		p = "[가-힣]+";
		s = "자바 스프링5";
		System.out.println(s.replaceAll(p, "")); // 5
		
		p = "[가-힣]+\\b"; // \\b:단어경계
		s = "자바 스프링5";
		System.out.println(s.replaceAll(p, "")); // 자바 5
		
		p = "010-\\d{4}-\\d{4}";
		s = "010-1111-1234";
		System.out.println(s.matches(p)); // true
		
		// 숫자가 아닌것을 모두 *로
		s = "우리 12 abc 67 & 79";
		// p = "[^0-9]"; // 숫자가 아닌것
		p = "\\D"; // 숫자가 아닌것
		s = s.replaceAll(p, "*");
		System.out.println(s);
	}
}
