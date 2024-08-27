package ch07.unit08;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		int[] c = {1,2,3,4,5};
		
		// 주소 비교
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(b));
		System.out.println();
		
		// 요소의 값 비교
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
		
		int[][] aa = {{1,2},{3,4}};
		int[][] bb = {{1,2},{3,4}};
		
		System.out.println(Arrays.equals(aa, bb));
			// false. 2차원배열은 1차원에서 가진 주소 비교
		System.out.println(Arrays.deepEquals(aa, bb));
			// true. 2차원 배열의 값비교
	}
}
