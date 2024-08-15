package ch04.unit03.whileEx;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, t;
		int s, n;
		
		System.out.print("두수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) { // 적은값은 a, 큰값은 b
			t = a; a = b; b = t;
		}
		
		s = 0;
		n = a;
		while( n <= b ) {
			s += n;
			n++;
		}
		
		System.out.printf("%d ~ %d 까지 합 : %d\n", a, b, s);
		
		sc.close();
		
		

	}

}
