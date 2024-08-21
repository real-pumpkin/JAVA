package ch06.unit03;

public class Ex10 {

	public static void main(String[] args) {
		Test10 t = new Test10();
		
		t.print(3);
		System.out.println();
	}
}

class Test10 {
	public void print(int n) {
		System.out.println("start : " + n);
		
		if(n > 1) {
			print(n-1);
			print(n-1);
		}
		System.out.println("end : " + n);
	}
}

