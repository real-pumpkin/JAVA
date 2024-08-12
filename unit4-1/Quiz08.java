package practice0812;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int gradn, midn, lastn, away, reportn;
		String name;
		
		System.out.print("학번? ");
		gradn=sc.nextInt();
		System.out.print("이름? ");
		name=sc.next();
		System.out.print("중간고사 점수? ");
		midn=sc.nextInt();
		System.out.print("기말고사 점수? ");
		lastn=sc.nextInt();
		System.out.print("결석 횟수 ?");
		away=sc.nextInt();
		System.out.print("레포트 점수 ? ");
		reportn=sc.nextInt();
		
		//출석점수 구하기
		int attend;
		if(away == 0) {
		attend = 100;
		}else if(away >=1 && away <=3){
		attend = 80;
		}else if(away >=4 && away <=5){
		attend = 60;	
		}else {
		attend = 0;
		}
		
		
		//합산점수
		double sum = (midn*0.4) + (lastn*0.4) + (attend*0.1) + (reportn*0.1);
		
		//학점
		String grade;
	        if (sum >= 90) {
	            grade = "A";
	        } else if (sum >= 80) {
	            grade = "B";
	        } else if (sum >= 70) {
	            grade = "C";
	        } else if (sum >= 60) {
	            grade = "D";
	        } else {
	            grade = "F";
	        }
	        System.out.println("학번	이름	중간고사	기말고사	출석점수	레포트	합산점수	학점");
	        System.out.printf("%d	%s	%d	%d	%d	%d	%.2f	%s", gradn, name, midn, lastn, attend, reportn, sum, grade);
		
	     sc.close();
	}
}
