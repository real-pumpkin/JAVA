package ch07.unit03;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex06 {

	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("123456789.123456789");
		BigDecimal b = new BigDecimal("34567.89");
		
		// 나누기
		// BigDecimal c = a.divide(b); // 런타임 오류
		BigDecimal c = a.divide(b, RoundingMode.DOWN); // 반올림하지 않음
		System.out.println(c);
		
		c = a.divide(b, 3, RoundingMode.DOWN); // 소수점 3자리까지만
		System.out.println(c);
		
		System.out.println(a.toBigInteger()); // BigInteger 로 변환

	}

}
