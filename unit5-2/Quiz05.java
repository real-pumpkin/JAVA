package ch05.unit02;

public class Quiz05 {

	public static void main(String[] args) {
		int [][] a = new int[5][5];
		int n = 0;
		
		int k;
		for(int i=0; i<9; i++) {
			for(int j=0; j<5; j++) {
				k = i - j;
				if(k < 0 || k > 4) {
					continue;
				}
				
				a[j][k] = ++n;
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
