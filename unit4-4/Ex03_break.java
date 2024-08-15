package ch04.unit04;

import java.util.Scanner;

/*
    1.합 2.짝수합 3.홀수합 4.종료 => 1
    
    원하는 수 ? 10
    
    합 : 55
    
    1.합 2.짝수합 3.홀수합 4.종료 => 

*/

public class Ex03_break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int inputNum, s, start, step;
		String msg;
		
		while(true) {
			do {
				System.out.print("1.합 2.짝수합 3.홀수합 4.종료 => ");
				ch = sc.nextInt();
			} while(ch < 1 || ch > 4);
			
			if(ch == 4) {
				break;
			}
			
			do {
				System.out.print("원하는수 ? ");
				inputNum = sc.nextInt();
			} while(inputNum < 1);
			
			if(ch == 1) {
				start = 1; step = 1; msg = "합";
			} else if( ch == 2) {
				start = 2; step = 2; msg = "짝수합";
			} else {
				start = 1; step = 2; msg = "홀수합";
			}
			
			s = 0;
			for(int i = start; i<=inputNum; i+=step) {
				s += i;
			}
			System.out.println(msg + " : " + s);
			
		}
		
		sc.close();
		

	}

}
