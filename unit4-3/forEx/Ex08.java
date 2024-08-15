package ch04.unit03.forEx;

public class Ex08 {

	public static void main(String[] args) {
		// 1~100 까지 수중 3의 배수를 한줄에 10개씩 출력하고
		//   마지막에 3의 배수의 합과 평균 출력
		
		int s = 0;
		int cnt = 0;
		
		for(int n=3; n <=100; n+=3) {
			cnt++;
			// System.out.print(n + (cnt%10==0 ? "\n" : "\t"));
			
			System.out.print(n + "\t");
			if(cnt%10 == 0) {
				System.out.println();
			}
		
			s+=n;
		}

		System.out.println("\n합:" + s);
		System.out.println("평균:" + (s/cnt));
		
	}

}
