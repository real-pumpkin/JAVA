package ch04.unit02;

import java.util.Scanner;

public class Ex01_switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		//1 ~3 사이의 수를 입력받아 입력 받은 수만큼 *찍기
		System.out.print("수[1~3]");
		n = sc.nextInt();
		
		switch(n) {
			case 3 : System.out.print("*");
			case 2 : System.out.print("*");
			case 1 : System.out.print("*");
		}
		sc.close();
	}
}
