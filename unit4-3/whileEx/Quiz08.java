package ch04.unit03.whileEx;

public class Quiz08 {

	public static void main(String[] args) {
		int s = 0, t = 1, n = 0;
		
		while( n < 20) {
			// System.out.println(t);
			s += t;
			n++;
			t+=n;
		}
		System.out.println("결과:"+s);

	}

}
