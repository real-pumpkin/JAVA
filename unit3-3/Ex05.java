package ch03.unit03;

public class Ex05 {

	public static void main(String[] args) {
		int a, b;
		int key = 7788;
		
		a = 23;
		b = a ^ key;
		System.out.println(b);
		
		b = b ^ key;
		System.out.println(b);
	}
}
