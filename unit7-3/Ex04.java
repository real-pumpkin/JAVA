package ch07.unit03;

public class Ex04 {

	public static void main(String[] args) {
		double a;
		String s = "123.5";

		// 문자열을 double 로
		a = Double.parseDouble(s);
		// a = Double.valueOf(s);
		System.out.println(a);
		
		// double을 문자열로
		a = 123.45;
		s = Double.toString(a);
		System.out.println(s);
	}
}
