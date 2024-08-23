package ch07.unit04;

public class Ex07 {

	public static void main(String[] args) {
		String s;
		int n, m;
		
		s = "  자  바  ";
		System.out.println(":" + s + ":");
		System.out.println(":" + s.trim() + ":"); // 왼쪽과 오른쪽 공백제거
		System.out.println(":" + s.replaceAll("\\s", "") + ":");
		
		n = 30;
		// s = n; // 컴오류
		// s = "" + n; // 숫자를 문자열로
		s = Integer.toString(n); // 숫자를 문자열로
		System.out.println(s);
		
		n = 123456;
		m = 15;
		
		// 서식에 맞추어 문자열로 변환하여 반환
		s = String.format("%,d", n);
		System.out.println(s); // 123,456
		
		s = String.format("%d %d %d", n, m, n);
		System.out.println(s);
		
		s = String.format("%1$d %2$d %1$d", n, m);
		System.out.println(s);
		
		s = "자바,스프링,오라클,HTML";
		String[] ss = s.split(",");
		for(String a : ss) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		s = "KOREA";
		byte[] bb = s.getBytes();
		for(byte b : bb) {
			System.out.print(b + " ");
		}
		System.out.println();
	}
}
