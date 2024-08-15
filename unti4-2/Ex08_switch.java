package ch04.unit02;

import java.util.Scanner;

public class Ex08_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y, m;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();
		
		System.out.print("월 ? ");
		m = sc.nextInt();
		
		var d = switch(m) {
		case 1,3,5,7,8,10,12 -> 31;
		case 4,6,9,11 -> 30;
		case 2 -> y%4==0 && y%100!=0 || y%400==0 ? 28 : 29;
		default -> "입력에러";
		};
		
		System.out.println(d);
		
		sc.close();
	}

}
