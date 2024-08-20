package ch06.score;

import java.util.Scanner;

public class ScoreUI {
	private Scanner sc = new Scanner(System.in);
	private Score ss = new Score();
	
	public void menu() {
		int ch;
		
		while(true) {
			do {
				System.out.print("1.등록 2.학번검색 3.리스트 4.평점 5.수정 6.삭제 7.종료 => ");
				ch = sc.nextInt();
			} while(ch<1 || ch>7);
			
			if(ch == 7) {
				return; // menu() 를 빠져 나감
			}
			
			switch(ch) {
			case 1: input(); break;
			case 2: findByHak(); break;
			case 3: dispAll(); break;
			case 4: dispGrade(); break;
			case 5: update(); break;
			case 6: delete(); break;
			}
		}
		
	}
	
	protected void input() {
		System.out.println("\n데이터 입력...");
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("학번 ? ");
		vo.setHak(sc.next());
		
		System.out.print("이름 ? ");
		vo.setName(sc.next());
		
		System.out.print("국어 ? ");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어 ? ");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학 ? ");
		vo.setMat(sc.nextInt());
		
		ss.append(vo);
		
		System.out.println("등록 완료\n"); 
	}
	
	protected void findByHak() {
		System.out.println("\n학번 검색...");
		
		String hak;
		
		System.out.print("검색할 학번 ? ");
		hak = sc.next();
		
		ScoreVO vo = ss.findByHak(hak);
		if(vo == null) {
			System.out.println("등록된 학번이 아닙니다.\n");
			return;
		}
		
		System.out.print(vo.getHak() + "\t");
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getKor() + "\t");
		System.out.print(vo.getEng() + "\t");
		System.out.print(vo.getMat() + "\t");
		System.out.print(vo.getTot() + "\t");
		System.out.println( vo.getTot() / 3 );		
		System.out.println();
	}
	
	protected void dispAll() {
		System.out.println("\n리스트...");
		
		int count = ss.getCount();
		ScoreVO[] list = ss.listScore();
		
		for(int i=0; i<count; i++) {
			ScoreVO vo = list[i];
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.getTot() + "\t");
			System.out.println( vo.getTot() / 3 );
		}
		System.out.println();
		
	}
	
	protected void dispGrade() {
		System.out.println("\n평점 리스트...");
		
		int count = ss.getCount();
		ScoreVO[] list = ss.listScore();
		
		for(int i=0; i<count; i++) {
			ScoreVO vo = list[i];
			System.out.print( vo.getHak() + "\t" );
			System.out.print( vo.getName() + "\t" );
			System.out.print( ss.grade(vo.getKor()) + "\t" );
			System.out.print( ss.grade(vo.getEng()) + "\t" );
			System.out.print( ss.grade(vo.getMat()) + "\n" );
		}
		System.out.println();
		
	}
	
	protected void update() {
		System.out.println("\n데이터 수정...");
	}

	protected void delete() {
		System.out.println("\n데이터 삭제...");
	}
	
}

