package ch12.unit02.score;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

public class ScoreUI {
	private BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
	private Score ss = new ScoreImpl();
	
	public void menu() {
		int ch;
		
		while(true) {
			try {
				do {
					System.out.print("1.등록 2.수정 3.삭제 4.리스트 5.학번검색 6.이름검색 7.종료 => ");
					ch = Integer.parseInt(br.readLine());
				} while(ch < 1 || ch > 7);
				
				if(ch == 7) {
					return;
				}
				
				switch(ch) {
				case 1: insert(); break;
				case 2: update(); break;
				case 3: delete(); break;
				case 4: printAll(); break;
				case 5: findByHak(); break;
				case 6: findByName(); break;
				}
				
			} catch (Exception e) {
			}
		}
		
	}
	
	protected void insert() {
		System.out.println("데이터 등록...");
		
		ScoreVO vo = new ScoreVO();
		
		try {
			System.out.print("학번 ? ");
			vo.setHak(br.readLine());
			System.out.print("이름 ? ");
			vo.setName(br.readLine());
			System.out.print("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			System.out.print("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			System.out.print("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			ss.insertScore(vo);
			
			System.out.println("등록 완료...");
			
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
	}
	
	protected void update() {
		System.out.println("데이터 수정...");
		String hak;
		
		try {
			System.out.print("수정할 학번 ? ");
			hak = br.readLine();
			
			ScoreVO vo = ss.findByHak(hak);
			if(vo == null) {
				System.out.println("등록된 자료가 아닙니다.\n");
				return;
			}
			
			System.out.print("이름 ? ");
			vo.setName(br.readLine());
			System.out.print("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			System.out.print("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			System.out.print("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));

			System.out.println("수정 완료..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	protected void delete() {
		System.out.println("데이터 삭제...");
		String hak;
		
		try {
			System.out.print("삭제할 학번 ? ");
			hak = br.readLine();
			
			if(ss.deleteScore(hak)) {
				System.out.println("삭제 완료.");
			} else {
				System.out.println("등록된 자료가 아님");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	protected void printAll() {
		System.out.println("데이터 리스트...");
		
		List<ScoreVO> list = ss.listScore();
		int tot;
		for(ScoreVO vo : list) {
			tot = vo.getKor() + vo.getEng() + vo.getMat();
					
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(tot + "\t");
			System.out.println(tot/3);
		}
		System.out.println();
	}
	
	protected void findByHak() {
		System.out.println("학번 검색...");
		String hak;
		
		try {
			System.out.print("검색할 학번 ? ");
			hak = br.readLine();
			
			ScoreVO vo = ss.findByHak(hak);
			if(vo == null) {
				System.out.println("등록된 학번이 아닙니다.");
				return;
			}
			
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.println(vo.getMat());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
	}
	
	protected void findByName() {
		System.out.println("이름 검색...");
		
		String name;
		try {
			System.out.print("검색할 이름 ? ");
			name = br.readLine();
			
			/*
			for(ScoreVO vo : ss.listScore()) {
				if(vo.getName().indexOf(name) >= 0) {
					System.out.print(vo.getHak() + "\t");
					System.out.print(vo.getName() + "\t");
					System.out.print(vo.getKor() + "\t");
					System.out.print(vo.getEng() + "\t");
					System.out.println(vo.getMat());
				}
			}
			*/
			
			// 비효율적 : 검색할때마다 ArrayList 객체가 생성
			List<ScoreVO> list = ss.listScore(name);
			System.out.println("검색인원 : " + list.size());
			
			Iterator<ScoreVO> it = list.iterator();
			while(it.hasNext()) {
				ScoreVO vo = it.next();
				
				System.out.print(vo.getHak() + "\t");
				System.out.print(vo.getName() + "\t");
				System.out.print(vo.getKor() + "\t");
				System.out.print(vo.getEng() + "\t");
				System.out.println(vo.getMat());				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
}
