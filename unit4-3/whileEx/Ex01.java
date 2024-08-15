package ch04.unit03.whileEx;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		int n;
		n = 0; // 반드시 초기화
		while( n < 10) {
			n++;
			System.out.print(n + "  "); // 1 2 3 4 5 6 7 8 9 10
		}
		System.out.println();
		System.out.println(n); // 10
		*/
	
		/*
		int n = 0;
		while(n++ < 10) {
			System.out.print(n + "  "); // 1 2 3 4 5 6 7 8 9 10
		}
		System.out.println();
		System.out.println(n); // 11
		*/
		
		int n = 0;
		while(++n <= 10) {
			System.out.print(n + "  "); // 1 2 3 4 5 6 7 8 9 10
		}
		System.out.println();
		System.out.println(n); // 11
		
	}

}
