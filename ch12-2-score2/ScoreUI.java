package ch12.unit02.score2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class ScoreUI {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Score ss = new ScoreImpl();
	
	public void menu() {
		int ch;
		
		while(true) {
			try {
				do {
					System.out.print("1.등록 2.수정 3.삭제 4.리스트 5.학번검색 6.이름검색 7.총점내림차 8.이름오름차 9.종료 => ");
					ch = Integer.parseInt(br.readLine());
				} while(ch < 1 || ch > 9);
				
				if(ch == 9) {
					return;
				}
				
				switch(ch) {
				case 1: insert(); break;
				case 2: update(); break;
				case 3: delete(); break;
				case 4: printAll(); break;
				case 5: findByHak(); break;
				case 6: findByName(); break;
				case 7: dispTotDesc(); break;
				case 8: dispNameAsc(); break;
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
			
			System.out.println("등록 완료 !!!");
			
		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 가능합니다.");
		} catch (MyDuplicationException e) {
			System.out.println("등록된 학번입니다.");
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

			System.out.println("수정 완료 !!!");
			
		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 가능합니다.");
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
				System.out.println("삭제 완료 !!!");
			} else {
				System.out.println("등록된 자료가 아닙니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	protected void printAll() {
		System.out.println("데이터 리스트...");
		
		List<ScoreVO> list = ss.listScore();
		display(list);
		
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
			
			List<ScoreVO> list = ss.listScore(name);
			System.out.println("검색인원 : " + list.size());
			
			display(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	protected void dispTotDesc() {
		System.out.println("총점내림차순 ...");
		
	}
	
	protected void dispNameAsc() {
		System.out.println("이름오름차순 ...");
		
	}
	
	private void display(List<ScoreVO> list) {
		for(ScoreVO vo : list) {
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.println(vo.getAge());
		}
	}
	
}
