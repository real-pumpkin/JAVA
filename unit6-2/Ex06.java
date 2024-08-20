package ch06.unit02;

public class Ex06 {
	int r;
	static double PI = 3.141592;
	
	public double area() {
		return r * r * PI;
	}
	
	public double length() {
		return r * 2 * PI;
	}
	
	public static void main(String[] args) {
		// r = 10; // 컴오류발생
		
		Ex06 obj = new Ex06();
		obj.r = 10;
		
		double a, b;
		a = obj.area();
		b = obj.length();
		
		System.out.println("반지름 : " + obj.r);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + b);
	}

}
