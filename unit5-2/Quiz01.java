package ch05.unit02;

public class Quiz01 {

	public static void main(String[] args) {
		int [][]a = new int[5][5];
		int n = 0;
		
		/*
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				++n;
				if(i%2 == 0) {
					a[i][j] = n; 
				} else {
					a[i][4-j] = n;
				}
			}
		}
		*/

		int col;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				col = i%2 == 0 ? j : 4-j;
				a[i][col] = ++n;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
		

	}

}
