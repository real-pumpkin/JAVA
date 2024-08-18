package ch05.unit01;

import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		int []a = new int[] {10,5,7,13,12};
		
		System.out.print("원시 데이터 : ");
		for(int n : a) {
			System.out.print(n + "  ");
		}
		System.out.println();
		
		Arrays.sort(a); // 크기순으로 정렬
		
		System.out.print("정렬 데이터 : ");
		for(int n : a) {
			System.out.print(n + "  ");
		}
		System.out.println();
		

	}

}
