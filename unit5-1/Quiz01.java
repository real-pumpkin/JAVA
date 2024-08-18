package ch05.unit01;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] tti = new String[] {"원숭이", "닭","개","돼지","쥐",
				"소","범","토끼","용","뱀","말","양"};
		int year;
		
		do {
			System.out.print("년도 ? ");
			year = sc.nextInt();
		} while(year < 1900);
		
		System.out.println(year+"년도는 " + tti[year%12] + "띠의 해입니다.");
		
		sc.close();
	}

}
