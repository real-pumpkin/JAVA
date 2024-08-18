package ch04.unit03.quiz;

/*
	- 369 게임
	  1~100 까지 수중 3, 6, 9가 들어 있는 수는 * 를 출력하고
	  기타 숫자는 해당 숫자를 한줄에 10개씩 출력하는 프로그램
*/
public class Quiz03_Make369 {
	public static void main(String[] args) {
/*
		int a = 123;
		System.out.println("일의 자리 수 : " + (a % 10));
		System.out.println("10의 자리 수 : " + (a / 10 % 10));
		System.out.println("100의 자리 수 : " + (a / 100 % 10));
*/
		
		int count = 0;
		for (int n = 1; n <= 100; n++) {
			count = 0;
			
			if ((n % 10) >= 3 && (n % 10) % 3 == 0) { // 일의 자리
				count++;
			}
			if ((n / 10) >= 3 && (n / 10) % 3 == 0) { // 10의 자리
				count++;
			}

			if (count >= 1) {
				System.out.print("    *");
			} else {
				System.out.printf("%5d", n);
			}

			if (n % 10 == 0) {
				System.out.println();
			}
		}
	}
}
