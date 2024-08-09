package ch03.unit01;

public class Ex01 {

	public static void main(String[] args) {
		byte b1 = 5, b2 = 2, b3;
		
		// b3 = b1 + b2; // 컴파일 오류
			// 피연산자의 byte는 int로 변환하여 연산하므로 결과는 int
			// byte + byte => int + int => int
		b3 = (byte)(b1+b2);
			// 연산 결과를 byte로 변환
		System.out.println(b3);
		
		b1 = 100;
		b2 = 120;
		b3 = (byte)(b1+b2);
			//연산 결과가 overflow가 발생
		System.out.println(b3); //-36
		
		short s1 = 10, s2 = 5, s3;
		// s3 = s1 + s2; // 컴파일 오류. short + short => int + int
		s3 = (short)(s1 + s2);
		System.out.println(s3);

		char c1 = 'A', c2;
		//c1 = c1 + 10; //컴파일 오류 . char + int => int + int
		c2 = (char)(c1+10);
		System.out.println(c2);
		
	}
}
