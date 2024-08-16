package ch05.unit01;

public class Ex02 {

	public static void main(String[] args) {
		int [] score = new int[5];
		
		score[0] = 80; score[1] = 90; score[2] = 85; 
		score[3] = 90; score[4] = 100;
		
		/*
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		*/
		
		// 향상된 for 문
		for(int s : score) {
			System.out.println(s);
		}
		
		

	}

}
