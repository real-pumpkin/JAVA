package practice0812;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int a,b,c;
		
		System.out.print("이름 : ");
		name=sc.next();
		
		System.out.print("세과목 점수 :");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		int avg = (a+b+c)/ 3;
		String s;
		
		if(a>=40 && b>=40 && c>=40 && avg>=60) {
		s = "합격";
		}else if((a>=40 || b>=40 || c>=40) && avg>=60) {
		s = "과락";
		}else {
		s = "불합격";
		}
		System.out.printf("김자바님은 %s 입니다.", s);
		
		sc.close();
	}
}
