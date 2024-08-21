package ch06.unit03;

public class Ex03 {
	public static void main(String[] args) {
		Test3 t = new Test3();
		
		int []a = new int[] {1,3,5,7,9};
		int s;
		
		System.out.println("a배열...");
		disp(a);
		
		s = t.total(a) ;
		System.out.println(s);
		
		int []b = t.random();
		System.out.println("난수...");
		disp(b);
		
		b = t.random(5);
		System.out.println("\n난수...");
		disp(b);		
	}
	
	public static void disp(int[] num) {
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "  ");
		}
		System.out.println();
	}
	
	
}

class Test3 {
	// 인자로 넘어온 정수형 배열의 합 구하기
	public int total(int[] num) {
		int s = 0;
		
		for(int n : num) {
			s += n;
		}
		
		return s;
	}
	
	public int[] random() {
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100) + 1;
		}
		
		return a;
	}
	
	public int[] random(int count) {
		if(count < 1) {
			return null;
		}
		
		int []a = new int[count];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100) + 1;
		}
		
		return a;
	}
	
	
}
