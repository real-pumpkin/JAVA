package ch07.unit01;

public class Ex03 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int a;
		double s;
		
		System.out.print("각도 ? ");
		a = sc.nextInt();
		
		// Math 는 java.lang 패키지에 있으므로 import 하지 않음
		s = Math.cos(Math.PI * a / 180.0);
		
		System.out.println(a + "각도의 cos 값 : " + s);

		sc.close();
	}

}
