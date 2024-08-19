package ch05.unit02;

public class Quiz04 {

	public static void main(String[] args) {
		int [][] a = new int[5][5];
		int n = 0;
		
		for(int i=0; i<5; i++) {
			for(int j=i; j<5; j++) {
				a[i][j] = ++n;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j] != 0)
					System.out.printf("%3d", a[i][j]);
				else 
					System.out.print("   ");
			}
			System.out.println();
		}

	}

}
