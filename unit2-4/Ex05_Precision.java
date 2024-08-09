package ch02.unit04;

public class Ex05_Precision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정밀도
		
		int a = 2_000_000_000;
		int b = 2_000_000_050;
		
		float c = 2_000_000_050;
		float d = 2_000_000_050;

		double e = 2_000_000_050;
		double f = 2_000_000_050;
		
		System.out.printf("int : %d %d\n",a, b);
		System.out.printf("float : %.2f %.2f\n",c, d);
		System.out.printf("double : %.2f %.2f\n",e, f);

		System.out.println(a == b); // false
		System.out.println(c == d); // true
		System.out.println(e == f); // false
	
		
	}

}
