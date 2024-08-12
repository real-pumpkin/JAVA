package ch04.unit01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		char a, b; 
		
		System.out.print("문자 ?");
		a=sc.next().charAt(0);
		
		
		if(a >= 'A'&& a <= 'Z') {
			b = (char)(a +32);
			
		}else if(a >= 'a' && a <='z') {
			b = (char)(a -32);
			
		}else {
			b = a; 
		}
		System.out.println(a + "=>" +b );
		sc.close();
	}
}
