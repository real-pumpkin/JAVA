package ch05.unit02;

public class Quiz02 {

	public static void main(String[] args) {
		char [][] a = new char[5][5];
		char c  = 'A';
		
		for(int i=0; i<5; i++) {
			for(int j = 4; j>=0; j--) {
				a[j][i] = c++;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3c", a[i][j]);
			}
			System.out.println();
		}

	}

}
