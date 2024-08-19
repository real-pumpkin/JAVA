package ch05.unit02;

public class Ex01 {

	public static void main(String[] args) {
		int [][]a = new int[3][4];
		
		System.out.println("행수:" + a.length);
		System.out.println("0행의 열수:" + a[0].length);
		
		System.out.println("배열의 참조위치:"+a);
		System.out.println("0행의 참조위치:"+a[0]);
		System.out.println("1행2열의 값:"+a[1][2]);
		
		int [][]b = new int[3][];
		b[0] = new int[4];
		b[1] = new int[3];
		b[2] = new int[5];
		
		System.out.println("b 행수:" + b.length);
		System.out.println("b의 0행의 열수:" + b[0].length);
		System.out.println("b의 1행의 열수:" + b[1].length);
		

	}

}
