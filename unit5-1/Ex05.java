package ch05.unit01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 5명의 이름과 점수를 입력 받아 편차(수-평균)를 계산하여 출력하고
		//    마지막에 총합과 평균 출력
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] score = new int[5];
		int tot;
		double ave;
		
		tot = 0;
		for(int i=0; i<name.length; i++) {
			System.out.print((i+1) +" 번째 이름 : ");
			name[i] = sc.next();
			System.out.print("     점수 : ");
			score[i] = sc.nextInt();
			
			tot += score[i];
		}
		ave = (double)tot / score.length;
		
		System.out.println("\n이름\t점수\t편차");
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(score[i] + "\t");
			System.out.println((score[i] - ave));
		}
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + ave);
		
		sc.close();
	}

}
