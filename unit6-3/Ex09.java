package ch06.unit03;

public class Ex09 {
	public static void main(String[] args) {
		Test9 t = new Test9();
		int s;
		
		s = t.sum(10);
		System.out.println(s);
		
		s = t.pow2(2,  10);
		System.out.println(s);
		
		double a;
		a = t.pow(2, 10);
		System.out.println(a);
		
		a = t.pow(2, -2);
		System.out.println(a);
		
		for(int i = 0; i<10; i++) {
			System.out.print(t.fibonacci(i) + " ");
		}
		System.out.println();
		
		s = t.gcd(24, 6);
		System.out.println("24와 6의 최대 공약수 : " + s);
	}
}

class Test9 {
	public int sum(int n) {
		return n > 1 ? sum(n-1) + n : 1;
	}
	
	// x의 y승
	public int pow2(int x, int y) {
		return y >= 1 ? x * pow2(x, y-1) : 1;
	}
	
	// x의 y승
	public double pow(int x, int y) {
		if(y >= 0) {
			return y == 0 ? 1 : x * pow(x, y-1);
		} else {
			return (1.0 / x) * pow(x, y+1);
		}
	}
	
	// 피보나치수열
	public int fibonacci(int n) {
		if(n < 2) {
			return n;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	// 최대공약수
	public int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
	
}

