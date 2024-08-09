package ch02.unit04;

public class Ex06_DataType {
	
	public static void main(String[] args) {
		// char : 2byte, 부호없는 정수 
		
		char c;
		
		c = 'A';
		System.out.println(c);
		
		c = '\u0041';
		System.out.println(c);
		
		c = '\101';
		System.out.println(c);
		
		int a;
		a = c; 
		System.out.println(a); // 'A'의 코드 값 : 65
		
		c = '대';
		a = c;
		System.out.println(a); // '대'의 유니코드값:45824
		
		double x = 'K';
		System.out.println(x); // 75.0
		
	}
}
