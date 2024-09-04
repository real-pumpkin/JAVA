package ch12.unit02.score2;

import java.util.ArrayList;
import java.util.List;

public class ScoreImpl implements Score {
	private List<ScoreVO> list = new ArrayList<ScoreVO>();
	
	@Override
	public void insertScore(ScoreVO vo) throws MyDuplicationException{
		if(findByHak(vo.getHak()) != null) {
			throw new MyDuplicationException("학번 중복입니다.");
		}
		
		list.add(vo); // List 객체의 마지막에 요소를 추가
	}

	@Override
	public List<ScoreVO> listScore() {
		return list;
	}

	@Override
	public ScoreVO findByHak(String hak) {
		for(ScoreVO vo : list) {
			if(vo.getHak().equals(hak)) {
				return vo;
			}
		}
		
		return null;
	}

	@Override
	public boolean deleteScore(String hak) {
		ScoreVO vo = findByHak(hak);
		
		return list.remove(vo);
	}

	@Override
	public List<ScoreVO> listScore(String name) {
		List<ScoreVO> findList = new ArrayList<ScoreVO>();
		
		for(ScoreVO vo : list) {
			if(vo.getName().indexOf(name) >= 0) {
				findList.add(vo);
			}
		}
		
		return findList;
	}

}
