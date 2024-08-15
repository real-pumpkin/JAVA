package ch04.unit03.whileEx;

public class Quiz10 {

	public static void main(String[] args) {
		int dan, n;

		/*
		n = 0;
		while(n < 3) {
			n++;
			System.out.println("n:"+n);
			
			dan = 0;
			while(dan < 4) {
				dan++;
				System.out.println(n+","+dan);
			}
		}
		*/

		n = 0;
		while(n < 9) {
			n++;
			dan = 1;
			while(dan < 9) {
				dan++;
				System.out.printf("%d * %d = %2d\t", dan, n, dan*n);
			}
			System.out.println();
		}
		
	}

}
