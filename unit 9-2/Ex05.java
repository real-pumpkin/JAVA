package ch09.unit02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int a, b, c;
		
		try {
			System.out.print("첫번째 수 ? ");
			a = Integer.parseInt(br.readLine());

			System.out.print("두번째 수 ? ");
			b = Integer.parseInt(br.readLine());
			
			c = a / b;
			System.out.printf("%d / %d = %d\n", a, b, c);
		} catch (Exception e) {
			// Exception
			//  : 모든 예외를 catch
			//  : 예외별로 예외를 분리할 수 없다.
			
			// 간단한 메시지 출력
			System.out.println(e.getMessage());
			
			// 발생한 예외 클래스 및 간단한 메시지 출력 
			// System.out.println(e.toString());
			
			// 자세한 에러 메시지 및 에러 발생줄도 표시
			// e.printStackTrace();
		}
		
		System.out.println("end...");

	}

}
