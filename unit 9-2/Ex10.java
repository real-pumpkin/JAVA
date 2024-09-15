package ch09.unit02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		int n;
		String s;
		
		// JDK 7.0 부터 가능
		// try ~ with ~ resource : 자동으로 resource 가 close 됨
		try( Scanner sc = new Scanner(System.in) ) {
			System.out.print("나이 ? ");
			n = sc.nextInt();
			
			s = n >= 19 ? "성인" : "초딩";
			System.out.println("결과 : " + s);
		} catch (InputMismatchException e) {
			System.out.println("나이는 숫자만...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
