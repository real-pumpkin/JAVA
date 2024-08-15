package ch04.unit03.whileEx;

public class Ex15 {

	public static void main(String[] args) {
		int n, s;
		
		n = s = 0;
		
		while(true) { // 무한루프
			n++;
			s+=n;
			if(n >= 10) {
				break; // while 문을 빠져 나감
			}
		}
		
		System.out.println(s);

	}

}
