package ch07.unit08;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		String[] ss = {"서울","부산","대구","인천","광주",
				"대전","울산","세종"};
		
		// 배열 복사
		String []ss2 = Arrays.copyOf(ss, ss.length);
								// 복사대상, 새로운길이
		System.out.println(Arrays.toString(ss2));

		String []ss3 = Arrays.copyOfRange(ss, 1, 4);
					// 복사대상, from, to-1
		System.out.println(Arrays.toString(ss3));
		
		
	}

}
