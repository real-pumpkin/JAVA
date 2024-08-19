package ch05.unit02;

public class Ex03 {

	public static void main(String[] args) {
		/*
		  1  6 11 16
		  2  7 12 17
		  3  8 13 18
		  4  9 14 19
		  5 10 15 20
		*/
		
		int [][]a = new int[5][4];
		int n = 0;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				a[j][i] = ++n;
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
