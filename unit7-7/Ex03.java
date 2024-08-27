package ch07.unit07;

import java.text.DecimalFormat;

public class Ex03 {

	public static void main(String[] args) {
		String s;
		// DecimalFormat : 패턴 형식으로 숫자를 문자열로 변환
		DecimalFormat df = new DecimalFormat("#,##0");
		s = df.format(1234.56789);
		System.out.println(s); // 1,235
		System.out.println();
		
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		System.out.println(df2.format(1234.456)); // 1.234.46
		System.out.println(df2.format(1234)); // 1,234
		System.out.println(df2.format(0.0)); // 0
		System.out.println(df2.format(0.5)); // 0.5
		System.out.println();

		DecimalFormat df3 = new DecimalFormat("#,###.0#");
		System.out.println(df3.format(1234.456)); // 1.234.46
		System.out.println(df3.format(1234)); // 1,234
		System.out.println(df3.format(0.0)); // .0
		System.out.println(df3.format(0.5)); // .5
		System.out.println();

		DecimalFormat df4 = new DecimalFormat("#,##0.0#");
		System.out.println(df4.format(1234.456)); // 1.234.46
		System.out.println(df4.format(1234)); // 1,234
		System.out.println(df4.format(0.0)); // 0.0
		System.out.println(df4.format(0.5)); // 0.5
		System.out.println();
		
	}

}
