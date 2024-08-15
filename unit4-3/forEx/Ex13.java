package ch04.unit03.forEx;

public class Ex13 {

	public static void main(String[] args) {
		
		for(int a=2; a<=9; a++) { // 8번 반복
			System.out.println(">> " + a + "단 <<");
			
			for(int b=1; b<=9; b++) { // 8*9=72번 반복
				System.out.printf("%d * %d = %d\n", a, b, a*b);
			}
			System.out.println();
		}
	}

}
