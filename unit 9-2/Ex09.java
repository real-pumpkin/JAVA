package ch09.unit02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		try {
			System.out.print("두수 ? ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.printf("%d / %d = %d\n", a, b, c);
			
		} catch (InputMismatchException e) {
			// InputMismatchException
			//   : unchecked exception
			//   : Scanner의 nextInt() 에서 숫자가 아닌 문자열을 입력하는 경우 발생
			System.out.println("숫자가 아닙니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 일반적으로 finally 블록은 리소스를 close 할때 사용
			sc.close();
		}
		
		System.out.println("end...");

	}

}
