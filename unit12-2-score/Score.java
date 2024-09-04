package ch12.unit02.score;

import java.util.List;

public interface Score {
	// 데이터 등록
	public void insertScore(ScoreVO vo);
	// 전체 리스트
	public List<ScoreVO> listScore();
	// 학번 검색
	public ScoreVO findByHak(String hak);
	// 삭제
	public boolean deleteScore(String hak);
	// 이름 검색
	public List<ScoreVO> listScore(String name);
}
