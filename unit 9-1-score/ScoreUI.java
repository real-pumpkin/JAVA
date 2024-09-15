package ch09.score;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreUI {
	private Scanner sc = new Scanner(System.in);
	private Score score = new ScoreImpl(); // up-casting
	
	public void menu() {
		int ch;

		while(true) {
			try {
				do {
					System.out.println("1.등록 2.수정 3.삭제 4.리스트");
					System.out.println("5.평점 6.이름검색 7.학번검색 8.종료");
					System.out.print("선택 => ");
					ch = sc.nextInt();
				} while(ch < 1 || ch > 8);
				
				if(ch == 8) {
					System.exit(0); // 프로그램 강제 종료
				}
				
				switch(ch) {
				case 1: input(); break;
				case 2: update(); break;
				case 3: delete(); break;
				case 4: dispAll(); break;
				case 5: dispGrade(); break;
				case 6: findByName(); break;
				case 7: findByHak(); break;
				}
				
			} catch (InputMismatchException e) {
				sc.nextLine();
			}
		}
		
	}
	
	protected void input() {
		System.out.println("\n입력...");
		
		ScoreVO vo = new ScoreVO();
		
		try {
			System.out.print("학번 ? ");
			vo.setHak(sc.next());
			
			if(score.indexOf(vo.getHak()) != -1) {
				System.out.println("등록된 학번이다.");
				return;
			}
			
			System.out.print("이름 ? ");
			vo.setName(inputName());
			
			System.out.print("국어 ? ");
			vo.setKor(inputScore());

			System.out.print("영어 ? ");
			vo.setEng(inputScore());
			
			System.out.print("수학 ? ");
			vo.setMat(inputScore());
			
			int cnt = score.append(vo);
			System.out.println("등록완료[전체:" + cnt + "명]");
			
		} catch (InputMismatchException e) {
			System.out.println("점수는 숫자만");
		} catch (KoreanException e) {
			System.out.println(e.getMessage());
		} catch (ScoreException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
	}
	
	protected void update() {
		System.out.println("\n수정...");
	}

	protected void delete() {
		System.out.println("\n삭제...");
	}
	
	protected void dispAll() {
		System.out.println("\n리스트...");
		
		System.out.println("전체인원수 : " + score.getCount());
		ScoreVO[] list = score.listScore();
		for(int i=0; i<score.getCount(); i++) {
			ScoreVO vo = list[i];
			System.out.println(vo);
		}
		
	}
	
	protected void dispGrade() {
		System.out.println("\n평점...");
	}
	
	protected void findByName() {
		System.out.println("\n이름검색...");
	}
	
	protected void findByHak() {
		System.out.println("\n학번검색...");
	}
	
	private String inputName() throws KoreanException {
		String s = null;
		String p = "^[가-힣]{2,}$";
		
		s = sc.next();
		if( ! s.matches(p)) {
			throw new KoreanException("이름은 두자이상.");
		}
		
		return s;
	}
	
	private int inputScore() throws ScoreException {
		int s = 0;
		
		try {
			s = sc.nextInt();
			if(s < 0 || s > 100) {
				throw new ScoreException("점수는 0~100 사이만 가능");
			}
		} catch (InputMismatchException e) {
			sc.nextLine();
			throw e;
		}
		
		return s;
	}
	
}
