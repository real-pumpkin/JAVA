package ch04.unit03.whileEx;

public class Ex10 {

	public static void main(String[] args) {
		// 1~100 까지 합을 출력 하되 숫자가 10의 배수가 될때마다 합 출력
		
		int n, s;
		
		n = s = 0;
		while(n < 100) {
			n++;
			s+=n;
			
			if(n%10 == 0) {
				System.out.println("1~"+ n+"까지 합 : " + s);
			}
		}
		

	}

}
