package ch06.score;

public class Score {
	private ScoreVO[] list;		// 학생정보
	private int count;			// 인원수
	
	public Score() { // 생성자. 초기화
		list = new ScoreVO[50];
		count = 0;
	}
	
	public int append(ScoreVO vo) {
		list[count++] = vo;

		return count;
	}
	
	public int getCount() {
		return count;
	}
	
	public ScoreVO[] listScore() {
		return list;
	}
	
	// 학번 검색
	public ScoreVO findByHak(String hak) {
		ScoreVO vo = null;
		
		for(int i = 0; i<count; i++) {
			if(list[i].getHak().equals(hak)) {
				vo = list[i];
				break;
			}
		}
		
		return vo;
	}
	
	public double grade(int score) {
		double result = 0.0;
		
		if(score >= 95) result = 4.5;
		else if(score >= 90) result = 4.0;
		else if(score >= 85) result = 3.5;
		else if(score >= 80) result = 3.0;
		else if(score >= 75) result = 2.5;
		else if(score >= 70) result = 2.0;
		else if(score >= 65) result = 1.5;
		else if(score >= 60) result = 1.0;
		else result = 0.0;
		
		return result;
	}	
}
