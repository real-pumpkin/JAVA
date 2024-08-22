package ch07.unit03;

import java.math.BigInteger;

public class Ex05 {

	public static void main(String[] args) {
		// BigInteger : 큰 정수를 다루기 위한 클래스
		
		BigInteger a = new BigInteger("123456789123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");
		
		BigInteger c = a.add(b);
		System.out.println(c);
		
		BigInteger d = a.subtract(b);
		System.out.println(d);
		
		BigInteger e = a.multiply(b);
		System.out.println(e);
		
		BigInteger f = a.divide(b);
		System.out.println(f);
		
		BigInteger g = new BigInteger("12345");
		System.out.println(g.pow(123)); // 12345의 123 승
	}
}
