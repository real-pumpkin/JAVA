package ch03.unit01;

import java.util.Scanner;

public class Quiz04 {
	
// 주행거리 : 467km
// 속력 : 110km/h
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int km, speed;
		int h, m;
		double s, t;
		
		
		System.out.print("주행거리(km) ? ");
		km = sc.nextInt();
		System.out.print("시속(km/h) ? ");
		speed = sc.nextInt();
		
		t = (double)km / speed;
		
		h = (int)t;
		m = (int)(t * 60 % 60);
		s = (t * 3600) % 60;
		s = (int)(s * 100) / 100.0; // 소수점 3째자리 버림
		
		System.out.printf("%d 시간 %d 분 %.2f초\n", h,m,s);
		
		sc.close();
	}

}
