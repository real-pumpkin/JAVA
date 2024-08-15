package ch04.unit03.forEx;

public class Ex06 {

	public static void main(String[] args) {
		/*
		int n, s;
		s = 0;
		for(n=1; n<=10; n++) {
			s += n;
			System.out.println(n + ":" + s);
		}
		System.out.println("결과:"+s);
		*/
		
		/*
		int s, n;
		for(n=1, s=0; n<=10; s+=n, n++)
			;
		System.out.println("결과:"+s);
		*/
		
		// 잘못된 코딩 예
		int n, s;
		s = 0;
		for(n=1; n<=10; n++);
			s += n;
			
		System.out.println(n+","+s); // 11, 11
		
	}

}
