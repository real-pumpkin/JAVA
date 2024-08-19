package ch05.unit02;

public class Ex05 {

	public static void main(String[] args) {
		// 2차원 배열 초기화
		int[][] a = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = new int[][] {{10,20,30},{40,50},{60,70,80,90}};
		
		System.out.println("a 배열...");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("b 배열...");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.printf("%3d", b[i][j]);
			}
			System.out.println();
		}
		

	}

}
