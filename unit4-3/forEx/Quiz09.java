package ch04.unit03.forEx;

public class Quiz09 {

	public static void main(String[] args) {
		int s = 0;
		for(int i=1; i<=100; i++) {
			s += i;
			
			if(i%10==0) {
				System.out.printf("%d~%d까지 합 : %d\n", i-9,i,s);
				s = 0;
			}
		}

	}

}
