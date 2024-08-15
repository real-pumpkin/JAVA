package ch04.unit03.forEx;

public class Quiz04 {

	public static void main(String[] args) {
		// 구구단
		for(int n=1; n<=9; n++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.printf("%d*%d=%2d  ", dan,n,dan*n);
			}
			System.out.println();
		}
	}

}
