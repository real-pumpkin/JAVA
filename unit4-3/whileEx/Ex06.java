package ch04.unit03.whileEx;

public class Ex06 {

	public static void main(String[] args) {
		int n, s;
		
		n = s = 0;
		while(n++ <= 9) {
			s+=n;
		}
		System.out.println(n +"," + s); // 11,55 

	}

}
