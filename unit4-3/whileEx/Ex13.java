package ch04.unit03.whileEx;

public class Ex13 {

	public static void main(String[] args) {
		// 1~100 까지 수중 3 또는 5의 배수를 제외한 수를
		//  한줄에 5개씩 출력하고 마지막에 합 출력하기
		
		int n = 0, s = 0, cnt = 0;
		while(n < 100) {
			n++;
			
			if(n%3 != 0 && n%5 != 0) {
				s += n;
				System.out.print(n + "\t");
				
				cnt++;
				if(cnt%5 == 0)
					System.out.println();
			}
		}
		
		System.out.println("\n결과 : " + s);

	}

}
