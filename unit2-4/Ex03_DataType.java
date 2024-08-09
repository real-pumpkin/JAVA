package ch02.unit04;

public class Ex03_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		short a = 350;
		short b = -350;
		System.out.printf("%X %X\n", a, b); // 15E FEA2
		System.out.printf("%04X %04X\n", a, b); //015E FEA2
			// 0000 0001 0101 1110
		
		// byte b1 = 100; // 가능
		// byte b1 = 129; // 컴오류
		byte b1 = (byte)129; 
		byte b2 = (byte)385; 
		System.out.println(b1 + "," + b2);
		System.out.println(b1 == b2); // ==:두 값이 같으면 true
		
	}

}
