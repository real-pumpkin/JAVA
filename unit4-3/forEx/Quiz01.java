package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s, inputNum;
		
		do {
			System.out.print("수 ? ");
			inputNum = sc.nextInt();
		} while(inputNum<1 || inputNum>1000);
		
		s = 0;
		for(int i=1; i<=inputNum; i++) {
			s += i;
		}
		
		System.out.println("결과:" + s);
		
		sc.close();
	}

}
