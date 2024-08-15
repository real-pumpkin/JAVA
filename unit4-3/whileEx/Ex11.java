package ch04.unit03.whileEx;

public class Ex11 {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+...(1+2+...9+10)
		int n, s, ss;
		
		n = s = ss = 0;
		while(n < 10) {
			n++;
			s+=n;
			ss+=s;
		}
		System.out.println(ss);

	}

}
