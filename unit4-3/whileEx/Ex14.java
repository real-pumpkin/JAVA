package ch04.unit03.whileEx;

/*
  - 난수 : 정의된 범위 내에서 무작위로 추출된 수(복원추출)
    Math.random() : 0 <= 난수 < 1 사이의 난수 발생(실수)
    Math.random()*100 : 0 <= 난수 < 100 사이의 난수 발생(실수)
*/

public class Ex14 {
	public static void main(String[] args) {
		int n, cnt;
		cnt = 0;
		while(cnt < 100) {
			cnt++;
			n = (int)(Math.random() * 100) + 1; // 1~100 사이의 난수
			
			System.out.printf("%5d", n);
			if(cnt % 10 == 0) {
				System.out.println();
			}
		}
	}

}
