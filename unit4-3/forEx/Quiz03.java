package ch04.unit03.forEx;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputNum;
		int even = 0, odd = 0;
		
		System.out.println("10개의 정수를 입력 하세요.");
		for(int i=1; i<=10; i++) {
			inputNum = sc.nextInt();
			
			if(inputNum%2==0) {
				even++;
			} else {
				odd++;
			}
		}
		
		System.out.println("짝수 개수:"+even);
		System.out.println("홀수 개수:"+odd);

		sc.close();
	}

}
