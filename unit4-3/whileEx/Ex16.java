package ch04.unit03.whileEx;

public class Ex16 {

	public static void main(String[] args) {
		int dan, n;
		
		dan = 1;
		
		while(dan < 9) {
			dan++;
			System.out.println("  "+ dan +"단");

			n = 0;
			while(n < 9) {
				n++;
				System.out.printf("%d * %d = %2d\n", dan, n, dan*n);
			}			
			
			System.out.println("---------------");
		}

	}

}
