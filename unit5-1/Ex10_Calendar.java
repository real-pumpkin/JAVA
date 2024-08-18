package ch05.unit01;

import java.util.Scanner;

public class Ex10_Calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		int year, month;
		int tot, week;
		
		do {
			System.out.print("년도 ? ");
			year = sc.nextInt();
		} while(year < 1900);
		
		do {
			System.out.print("월 ? ");
			month = sc.nextInt();
		} while(month < 1 || month > 12);
		
		// 1년1월1일 : 월요일
		// 년도가 4의배수이고 100의 배수가 아니거나 400의 배수이면 2월은 29, 그렇지 않으면 28
		
		days[1] = (year%4==0&&year%100!=0) || year%400==0 ? 29 : 28;
		
		// 1년 1월 1일 ~ year년 month월 1일까지 전체 날수
		tot = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		for(int i=0; i<month-1; i++) {
			tot += days[i];
		}
		tot+=1;
		
		week = tot%7;
		
		System.out.printf("\n\t%d년 %d월\n", year, month);
		System.out.println("  일   월   화  수   목   금   토");
		System.out.println("--------------------------------");
		
		for(int i=0; i<week; i++) {
			System.out.print("    "); // 공백 4칸을 띄우삼
		}
		
		for(int i=1; i<=days[month-1]; i++) {
			System.out.printf("%4d", i);
			
			if(++week % 7 == 0) {
				System.out.println();
			}
		}
		
		if(week%7!=0) {
			System.out.println();
		}
		System.out.println("--------------------------------");
		
		sc.close();
		
		
		
		
	}

}
