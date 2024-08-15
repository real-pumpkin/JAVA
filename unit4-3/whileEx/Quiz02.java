package ch04.unit03.whileEx;

public class Quiz02 {

	public static void main(String[] args) {
		int n, s;
		
		n = s = 0;
		
		while(n < 10) {
			n++;
			// s = s + (n%2==0 ? -n : n);
			// s += (n%2==0 ? -n : n);
			if(n%2==0) {
				s += -n;
			} else {
				s += n;
			}
		}
		
		/*
		 while(n < 10) {
		 	n++;
		 	s += n;
		 	n++;
		 	s -= n;
		 }
		 */
		
		System.out.println(s);

	}

}
