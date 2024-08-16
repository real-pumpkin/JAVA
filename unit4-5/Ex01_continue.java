package ch04.unit05;

public class Ex01_continue {

	public static void main(String[] args) {
		int n, s;
		
		n = s = 0;
		
		// continue : for, while, do~while 문에서 사용
		while(n<100) {
			n++;
			if(n%2==0||n%3==0) {
				continue;
			}
			s+=n;
		}
		System.out.println("결과:"+s);

	}

}
