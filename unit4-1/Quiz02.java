package ch04.unit01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int y;
		System.out.print("년도 : ");
		y=sc.nextInt();
		
		/*
		 * if(y%4==0&&y%100!=0||y%400==0{
		 	System.out.println(y + ":윤년");
		 }else {
		 	System.out.println(y + ":평년");
		 }
		 */
		
		if(y % 400 == 0) {
			System.out.println("2016년도는 윤년입니다.");
		}else if (!(y % 100 == 0)){
			System.out.println("2016년도는 윤년입니다.");
		}else if(y % 4 == 0){
			System.out.println("2016년도는 윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}
		
		sc.close();
	}
}
