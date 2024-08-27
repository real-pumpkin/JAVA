package ch07.unit06;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		// Random
		//  : 여러 형태의 난수를 제공
		//  : 연산 없이 정수등의 난수를 제공
		
		Random rnd = new Random();
		int n;
		
		for(int i=1; i<=100; i++) {
			n = rnd.nextInt(100); // 0~99 사이의 난수
			System.out.printf("%5d", n);
			if(i%10==0)
				System.out.println();
		}
	}
}
