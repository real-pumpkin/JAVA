package ch04.unit03.whileEx;

public class Quiz05 {

	public static void main(String[] args) {
		int s, n;
		
		s = n = 0;
		while(s <= 100) {
			n++;
			s += n;
		}
		
		System.out.println("n:" + n);
		System.out.println("합:" + s);
	}

}
