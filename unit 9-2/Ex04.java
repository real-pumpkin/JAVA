package ch09.unit02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int a, b, c;
		
		try {
			System.out.print("첫번째수 ? ");
			a = Integer.parseInt(br.readLine());
			
			System.out.print("두번째수 ? ");
			b = Integer.parseInt(br.readLine());
			
			c = a / b;
			System.out.printf("%d / %d = %d\n", a, b, c);

		// 예외를 상황별로 catch
		} catch (IOException e) {
			// IOException
			//  : checked exception
			//  : 입출력에 문제가 발생하면 발생하는 예외
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// NumberFormatException
			//  : unchecked exception
			//  : 문자열을 숫자로 변경하지 못하는 경우등에서 발생
			System.out.println("숫자만 입력 가능합니다.");
		} catch (ArithmeticException e) {
			// ArithmeticException
			//  : unchecked exception
			//  : 숫자를 0으로 나누는 등 연산이 불가능한 경우 발생 
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			// Exception
			//   : 모든 예외를 catch
			//   : 여러 예외를 catch 하는 경우 가장 마지막에 위치해야 함
			e.printStackTrace();
		}

		System.out.println("end...");
	}

}
