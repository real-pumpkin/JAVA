package ch04.unit03.whileEx;

public class Ex02 {

	public static void main(String[] args) {
		/*
		int n = 10;
		while(n < 10) { // 처음 조건이 거짓이면 한번도 실행하지 않음
			n++;
			System.out.println("안:" + n);
		}
		System.out.println("밖:" + n); // 10
		*/
		
		int n = 0;
		while(n < 10) {
			n += 2;
			System.out.print(n + "  "); // 2 4 6 8 10
		}
		System.out.println("\n" + n); // 10
		
	}

}
