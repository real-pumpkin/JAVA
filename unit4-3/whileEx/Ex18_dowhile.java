package ch04.unit03.whileEx;

public class Ex18_dowhile {

	public static void main(String[] args) {
		// 1~10까지 출력
		/*
		int n = 0;
		while(n<10) {
			n++;
			System.out.print(n + "  ");
		}
		System.out.println();
		*/
		
		/*
		int n = 0;
		do {
			n++;
			System.out.print(n + "  ");
		} while(n < 10);
		System.out.println();
		*/
		
		// 합구하기
		int n, s;
		n = s = 0;
		do {
			n++;
			s+=n;
		} while(n<10);
		System.out.println(s);

	}

}
