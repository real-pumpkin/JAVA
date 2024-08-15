package ch04.unit03.whileEx;

public class Ex12 {

	public static void main(String[] args) {
		// 1/2 + 2/3 .. 9/10
		int n = 0;
		double s = 0;
		
		
		while(n < 9) {
			n++;
			s += (double)n/(n+1);
		}
		
		System.out.println(s);
		
	}

}
