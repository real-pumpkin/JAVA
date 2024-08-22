package ch06.score;

public class Score {
	private ScoreVO[] list;		// 학생정보
	private int count;			// 인원수
	
	public Score() { // 생성자. 초기화
		count = 0;
		
		allocation(5);
	}
	
	// 배열의 메모리 할당
	private void allocation(int capacity) {
		ScoreVO[] temp = new ScoreVO[capacity];
		if(list != null && count > 0) {
			System.arraycopy(list, 0, temp, 0, count);
		}
		
		list = temp;
	}
	
	public int append(ScoreVO vo) {
		if(count >= list.length) {
			// 배열이 꽉차면 5개씩 늘림
			allocation(list.length + 5);
		}
		
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
	
	public boolean deleteScore(ScoreVO vo) {
		if(vo == null || count == 0) {
			return false;
		}
		
		for(int i = 0; i < count; i++) {
			if(vo == list[i]) {
				deleteScore(i);
				return true;
			}
		}
		
		return false;
	}
	
	public void deleteScore(int index) {
		if(index < 0 || index >= count) {
			return;
		}
		
		for(int i = index + 1; i < count; i++) {
			list[i-1] = list[i];
		}
		
		count--;
		list[count] = null;
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
