package ch04.unit03.whileEx;

public class Ex07 {

	public static void main(String[] args) {
		// 1*2*..*10 = ?
		int n, s;
		n=0;
		s=1;
		while(n<10) {
			n++;
			s*=n;
		}
		System.out.println("결과:"+s);

	}

}
