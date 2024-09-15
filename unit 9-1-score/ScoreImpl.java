package ch09.score;

import java.text.ChoiceFormat;

public class ScoreImpl implements Score {
	private ScoreVO[] list = null;
	private int count = 0;
	
	public ScoreImpl() {
		allocation(10);
	}
	
	// 배열 메모리 할당
	private void allocation(int capacity) {
		ScoreVO[] temp = new ScoreVO[capacity];
		
		if(list != null && list.length > 0) {
			System.arraycopy(list, 0, temp, 0, list.length);
		}
		
		list = temp;
	}
	
	@Override
	public int getCount() {
		// 배열에 저장된 데이터 개수
		return count;
	}

	@Override
	public ScoreVO[] listScore() {
		// ScoreVO 가 저장된 배열의 참조 값
		return list;
	}

	@Override
	public int append(ScoreVO vo) {
		// 배열에 ScoreVO 객체를 저장
		if(count >= list.length) {
			// 배열이 꽉찬 경우 배열을 10개 늘린다.
			allocation(list.length + 10);
		}
		
		list[count++] = vo;
		
		return count; // 등록된 개수를 반환
	}

	@Override
	public double grade(int score) {
		double[] limit = {0,60,65,70,75,80,85,90,95};
		String[] ss = {"0","1.0","1.5","2.0","2.5","3.0","3.5","4.0","4.5"};
		
		ChoiceFormat cf = new ChoiceFormat(limit, ss);
		
		return Double.parseDouble(cf.format(score));
	}

	@Override
	public ScoreVO findByHak(String hak) {
		// 학번 검색
		ScoreVO vo = null;
		
		for(int i=0; i<count; i++) {
			if(list[i].getHak().equals(hak)) {
				vo = list[i];
				break;
			}
		}
		
		return vo;
	}

	@Override
	public int indexOf(String hak) {
		// 학번이 list의 어느 인덱스에 있는지 반화
		for(int i=0; i<count; i++) {
			if(list[i].getHak().equals(hak)) {
				return i;
			}
		}
		
		return -1; // 없으면 -1
	}

	@Override
	public boolean remove(String hak) {
		int idx = indexOf(hak);
		if(idx == -1) {
			return false; // 데이터가 없는 경우
		}
		
		for(int i=idx; i<count-1; i++) {
			list[i] = list[i+1];
		}
		list[--count] = null; // 가장 마지막 데이터 제거
		
		return true; // 삭제한 경우
	}

}
