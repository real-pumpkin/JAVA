package ch07.unit06;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println(toNumber3());
		System.out.println(toNumber5());
	}

	// 1~9까지 수를 이용하여 사로다른 3자리 난수(123 ~ 987)
	public static String toNumber3() {
		StringBuilder sb = new StringBuilder();
		
		Random rd = new Random();
		String n;
		/*
		for(int i=0; i<3; i++) {
			n = Integer.toString(rd.nextInt(9) + 1);
			if(sb.indexOf(n) >= 0) {
				i--;
				continue;
			}
			sb.append(n);
		}
		*/
		
		while(sb.length() < 3) {
			n = Integer.toString(rd.nextInt(9) + 1);
			if(sb.indexOf(n) >= 0) {
				continue;
			}
			sb.append(n);
		}
		
		return sb.toString();
	}

	// 5자리 난수(00000 ~ 99999)
	public static String toNumber5() {
		return String.format("%05d", new Random().nextInt(100000));
	}
	
}
