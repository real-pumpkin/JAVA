package ch03.unit01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;		
		System.out.println("금액을 입력하시오");
		n = sc.nextInt();
		
	
		System.out.println("오만원 :" + (n/50000));
		System.out.println("만원권 :" + ((n%50000)/10000));
		System.out.println("오천원 :" + ((n%10000)/5000));
		System.out.println("천원권 :" + ((n%5000)/1000));
		System.out.println("오십원 :" + ((n%100)/50));
		System.out.println("십원 :" + ((n%50)/10));
		System.out.println("오원원 :" + (n%5));
		System.out.println("일원권 :" + ((n%5)/1));
		
	}
}
