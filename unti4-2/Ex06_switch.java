package ch04.unit02;

import java.util.Scanner;

public class Ex06_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y, m;
		
		System.out.print("년도 ? ");
		y = sc.nextInt();
		
		System.out.print("월 ? ");
		m = sc.nextInt();
		
		/*
		  - 강화된 switch
		    : 여러조건
		      case 값,값,값,값 -> 수식;
		    : 화살표 case 라벨(->)
		      마지막에 break를 사용하는 것과 동일
		      실행문이 1개 인 경우만 {} 생략 가능
		    : JDK 14에 표준화
		*/
		switch(m) {
		case 1,3,5,7,8,10,12 -> System.out.println("31 일");
		case 4,6,9,11 -> System.out.println("30 일");
		default -> {
			int d = y%4==0&&y%100!=0||y%400==0?29:28;
			System.out.println(d + " 일");
		  }
		}
		
		sc.close();
		

	}

}
