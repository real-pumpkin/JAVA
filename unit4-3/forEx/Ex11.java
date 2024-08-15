package ch04.unit03.forEx;

public class Ex11 {

	public static void main(String[] args) {
		// 다중 for
		for(int i=1; i<=3; i++) {
			System.out.println("i:"+i); // 1,2,3
			
			for(int j=1; j<=2; j++) { // 3*2=6번 반복
				System.out.println("i:"+i+", j:"+j);
			}
			System.out.println("----------------");
		}
		
	}

}
