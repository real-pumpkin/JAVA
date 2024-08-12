package ch04.unit01;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		
		System.out.print("점수 ? ");
		a=sc.nextInt();
		
		if(a >=95) {
			a = 4.5;
			System.out.printf("%.1f", a);
		}else if (a >= 90 && a <= 94) {
			a = 4.0;
			System.out.printf("%.1f", a);
		}else if (a >= 85 && a <= 89) {
			a = 3.5;
			System.out.printf("%.1f", a);
		}else {
			System.out.println("0 점 입니다.");
		}
		sc.close();
		
		/*
		 int score;
		 double grade;
		 System.out.print("점수 ? ");
		 score = sc.nextInt();
		 if(score >=0 && score < = 100) {
		 	if(score >= 95){
		 	grade = 4.5;
		 	}
		 	else if(score >= 90) {
		 	grade = 4.0;
		 	}else if(score >= 85) {
		 	grade = 3.5;
		 	} else {
		 	grade = 0.0;
		 	}
		 	System.out.printf("점수 : %d, 평점 : .1f\n", score, grade);
		 	} else{
		 	System.out.println("점수 입력 오류 입니다.");
		 }
		 }
		 */
	}
	
}
