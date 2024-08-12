package practice0812;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int y, m; 
		
		System.out.print("년도 : ");
		y=sc.nextInt();
		System.out.print("월 : ");
		m=sc.nextInt();
		
		int d = (y%4 == 0 ? (y%100 == 0 ?(y%400==0 ? 1:0) : 1) : 0);
		
		int lastday;
		
		switch(m) {
		case 1 : case 3: case 5: case 7: case 8: case 10: case 12:
		lastday = 31; break;
		case 4 : case 6: case 9: case 11:
		lastday = 30; break;
		case 2 : 
		lastday = (d == 1) ? 29 : 28; break;
		default : System.out.println("입력오류. 월은 1월에서 12사이의 숫자여야합니다.");
		return;
		}
		System.out.println(y + "년" + m + "월달은" + lastday + "일 입니다." );
		
		sc.close();
	}
}
