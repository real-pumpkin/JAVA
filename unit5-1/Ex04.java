package ch05.unit01;

public class Ex04 {

	public static void main(String[] args) {
		// 일반 변수
		/*
		int x = 10;
		int y = x;
		y += 20;
		System.out.println(x + "," + y); // 10, 30
		*/
		
		// 배열
		int []a = new int[3];
		a[0] = 10; a[1] = 20; a[2] = 30;
		System.out.println("초기 a 배열...");
		for(int n : a) {
			System.out.print(n + " "); // 10 20 30
		}
		System.out.println();
		
		int[] b = a;
		b[1] = 200;
		b[2] = 300;
		
		System.out.println("\na 배열...");
		for(int n : a) { // 10 200 300
			System.out.print(n + " ");
		}
		System.out.println();
		
		System.out.println("\nb 배열...");
		for(int n : b) { // 10 200 300
			System.out.print(n + " ");
		}
		System.out.println();
		
	}

}
