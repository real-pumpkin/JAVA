package ch07.unit07;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex01 {

	public static void main(String[] args) {
		String s;
		
		// 숫자 -> 문자열
		int a = 12345;
		s = Integer.toString(a);
		System.out.println(s);
		s = String.format("%,d", a);
		
		s = String.format("%.2f", 12345.6789);
		System.out.println(s);
		
		s = String.format(Locale.ITALY, "%.2f", 12345.6789);
		System.out.println(s);
		System.out.println("---------------------");
		
		// 숫자에 대한 포멧
		NumberFormat nf = NumberFormat.getInstance();
		
		s = nf.format(a);
		System.out.println(s); // 12,345
		
		double b = 3456.1568;
		s = nf.format(b);
		System.out.println(s); // 3,456.157
		
		NumberFormat nf2 = NumberFormat.getInstance();
		nf2.setMinimumFractionDigits(2); // 소수점 이하 최소자리
		nf2.setMaximumFractionDigits(4); // 소수점 이하 최대자리
		System.out.println(nf2.format(1234.45678));
		System.out.println(nf2.format(1234));
		System.out.println(nf2.format(1234.2));
		System.out.println();
		
		// 통화
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		s = nf3.format(123456.5);
		System.out.println(s); // ₩123,456
		
		// Locale.KOREA:한국
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.US);
		s = nf4.format(123456.5);
		System.out.println(s); // $123,456.50
		System.out.println();
		
		// 퍼센트
		NumberFormat nf5 = NumberFormat.getPercentInstance();
		s = nf5.format(0.23);
		System.out.println(s); // 23%
	}

}
