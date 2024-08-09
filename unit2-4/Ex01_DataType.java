package ch02.unit04;

public class Ex01_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			byte b1; // 변수 선언(-128 ~ 127) 
			byte b2 = 10; // 변수 선언과 동시에 초기화
			// byte b3 = 130; // 에러. 표현범위를 벗어남 
		
			//System.out.println(b1); 
				// 컴파일오류. 초기화하지 않는 변수는 연산에 사용 불가
			System.out.println(b2); // 10
			b2 = 30; // 프로그램 실행중 값 변경. 이전 값은 기억불가 
			System.out.println(b2); // 30
	
			short s1, s2 = 10; // short 타입 : -32768 ~ 32767
			s1 = 'A' ; // 65, 문자는 ASCII 코드로 저장되며 숫자 자료형에 대입 가능
			System.out.println(s1 + ", " + s2);
			
			int i1 = 200;
			int i2 = 'a'; // ASCII 97
			int i3;
			i3 = '1' + '2'; // 49 + 50
				// '1' : 문자로 ASCII 코드값이 49
			System.out.println(i1 + "," + i2 + "," + i3);
			 // b1 = i1; //컴파일 오류 
			  // byte < int 이며, 큰 자료형의 값을 적은 자료형에 대입 불가
			b1 = (byte)i1; // int형을 byte 형으로 변환하여 대입
				// 200은 byte에 대입할 수 없으며, overflow가 발생
			    // 200 : 1100 1000 => 가장 앞 1은 부호, 음수를 의미
			System.out.println(b1); // -56
			
			long l1, l2;
			l1 = 100; // int 리터널을 long 형 변수에 대입
				// int < long 이므로 적은 자료형의 값은 큰 자료형에 대입 가능 
			// l2 = 2200000000; // 컴파일 오류
				//int 리터널에는 2200000000이 없음
			l2 = 2200000000L; // long 형 리터널(대문자,소문자 상관없음)
			
			System.out.println(l1 + "," + l2);
			
			
	}

}
