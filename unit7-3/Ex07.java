package ch07.unit03;

public class Ex07 {

	public static void main(String[] args) {
		// System.out.println( 2 / 0 ); // 런타임 오류
		
		System.out.println( 2.0 % 0 ); // NaN
		// System.out.println( 0 / 0 ); // 런타임 오류
		System.out.println( 0.0 / 0.0 ); // NaN
		
		System.out.println( 2.0 / 0.0 ); // Infinity
		
		if(Double.isNaN(0.0 / 0.0)) {
			System.out.println("NaN ...");
		}
		
		if(Double.isInfinite(2.0 / 0.0)) {
			System.out.println("Infinity ...");
		}
	}
}
