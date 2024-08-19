package ch05.unit02;

import java.util.Scanner;

/*
  - 인원수(1이상)를 입력 받아 입력 받은 인원수 만큼의
    이름, 국어, 영어, 수학 점수를 입력 받아 총점, 평균, 석차 구하기
*/

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count;
		String []name;
		int[][] score;
		int []tot;
		int []rank;
		String[] title = new String[] {"국어", "영어", "수학"};
		
		do {
			System.out.print("인원수 ? ");
			count = sc.nextInt();
		} while(count < 1);
		
		// 메모리 할당
		name = new String[count];
		score = new int[count][3];
		tot = new int[count];
		rank = new int[count];
		
		// 데이터 입력 및 총점 계산
		for(int i=0; i<count; i++) {
			System.out.print("이름 ? ");
			name[i] = sc.next();
			for(int j=0; j<score[i].length; j++) {
				System.out.print(title[j] + " ? ");
				score[i][j] = sc.nextInt();
				
				tot[i] += score[i][j];
			}
		}
		
		// 석차 계산
		for(int i=0; i<count; i++) {
			rank[i] = 1;
		}
		
		for(int i=0; i<count-1; i++) {
			for(int j=i+1; j<count; j++) {
				if(tot[i]>tot[j]) {
					rank[j]++;
				} else if(tot[i]<tot[j]) {
					rank[i]++;
				}
			}
		}

		// 출력
		for(int i=0; i<count; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(tot[i]+"\t");
			System.out.print((tot[i]/3)+"\t");
			System.out.println(rank[i]);
		}

		sc.close();
	}

}
