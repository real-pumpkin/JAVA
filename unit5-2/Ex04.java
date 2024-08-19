package ch05.unit02;

public class Ex04 {

	public static void main(String[] args) {
		int [][]a = new int[5][4];
		int [][]b = new int[4][5];
		
		/*
		 5*4 배열에 1~100 사이의 난수를 발생하여 대입후 출력하고
		 5*4 행렬을 4*5 행렬로 변환하여 출력
		*/
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = (int)(Math.random()*100) + 1;
			}
		}
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				b[i][j] = a[j][i];
			}
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.printf("%4d", b[i][j]);
			}
			System.out.println();
		}
		
	}

}
