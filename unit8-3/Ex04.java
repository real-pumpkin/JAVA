package ch08.unit03;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		Object obj = "korea"; // up-casting
		// System.out.println(obj.length()); // 컴오류
		System.out.println(((String)obj).length()); // 다운
		
		Object n1 = 10;
		Object n2 = 10;
		// Object n3 = n1 + n2; // 컴오류
		Integer n3 = (Integer)n1 + (Integer)n2; // down-casting
		System.out.println(n3);
		
		// Object[] oo = {"seoul", 90, 80, "korea"};
		// Arrays.sort(oo); // 런타임
		
		Object[] oo = {"seoul", "jeoju", "korea"};
		Arrays.sort(oo);
		System.out.println(Arrays.toString(oo));
		
	}

}
