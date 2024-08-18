package ch05.unit01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[5];
		int t, max, min;
		
		t = 0;
		for(int i = 0; i < a.length; i++) {
			do {
				System.out.print((i+1) +"번째 : ");
				a[i] = sc.nextInt();
			} while(a[i] < 0 || a[i]>10);
			
			t += a[i];
		}
		
		max = min = a[0];
		for(int i=1; i<a.length; i++) {
			if(max < a[i]) 
				max = a[i];
			else if(min > a[i])
				min = a[i];
		}
		
		t = t - max - min;
		
		System.out.print("점수 리스트 : ");
		for(int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("취득점수 : " + t);
		
		sc.close();

	}

}
