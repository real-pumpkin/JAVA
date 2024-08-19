package ch05.unit03;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// System.arrayCopy() : 배열의 내용을 다른 배열에 복사
		
		int[] a = new int[] {10, 20, 30};
		int[] b = new int[a.length];
		int[] c = a;
		
		/*
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		*/
		System.arraycopy(a, 0, b, 0, a.length  );
				// 원본, 원본의시작위치, 복사할곳, 복사시킬시작위치, 복사시킬개수
		
		System.out.println(Arrays.toString(b));
		System.out.println(a == b); // 주소 비교. false
		
		c[1] = 100;
		System.out.println(a[1] + " : " + c[1]); // 100 : 100
		System.out.println(a == c); // 주소 비교. true
		
		

	}

}
