package ch06.unit03;

public class Ex12 {
	public static void main(String[] args) {
		Test12 t = new Test12();
		
		int s;
		
		// s = t.sum(10);
		// s = t.sum(new int[] {1,2,3});
		s = t.sum(1,2,3);
		System.out.println(s);
		
		// s = t.total(10); // 컴오류
		// s = t.total(1,2,3); // 컴오류
		s = t.total(new int[] {1,2,3});
		System.out.println(s);
		
	}
}

class Test12 {
	public int sum(int ...a) { // 비정형 인자
		// int []nn = a; // 가능
		int s = 0;
		
		for(int i=0; i<a.length; i++) {
			s += a[i];
		}
		
		return s;
	}
	
	public int total(int[] a) {
		int s = 0;
		
		for(int i=0; i<a.length; i++) {
			s += a[i];
		}
		
		return s;
	}
}
