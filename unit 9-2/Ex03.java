package ch09.unit02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) {
		// 버퍼를 활용하여 문자(열)을 입력 받음. 입력 속도 향상
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String s;
		int a, b, c;
		
		try {
			System.out.print("첫번째 수 ? ");
			s = br.readLine();
				// readLine()
				//  : 줄단위로 문자열 입력
				//  : checked exception(IOException)
				//    이 발생하므로 반드시 예외처리 해야 함
			
			a = Integer.parseInt(s);
				// 문자열을 숫자로 변환 못하면
				// NumberFormatException(unchecked exception)이 발생
			
			System.out.print("두번째 수 ? ");
			s = br.readLine();
			b = Integer.parseInt(s);
			
			c = a / b;
				// 숫자를 0으로 나누면
				// ArithmeticException 이라는 unchecked exception 발생
			
			System.out.printf("%d / %d = %d\n", a, b, c);
		} catch (IOException e) {
			// IOException
			//   : 입출력에 문제가 발생하면 발생하는 예외
			//     (checked exception)
			//   : checked exception은 메소드를 정의할 때
			//     throws 한 예외
			
			e.printStackTrace(); // 예외메시지를 표준출력장치에 출력
		}
		
		// 0으로 나누거나 문자열을 숫자로 변경하지 못하면
		//   비정상적으로 프로그램이 종료 되어
		//   아래 메시지를 출력 되지 않는다.
		System.out.println("end...");
	}

}
