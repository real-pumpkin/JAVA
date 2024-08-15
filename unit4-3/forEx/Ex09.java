package ch04.unit03.forEx;

public class Ex09 {

	public static void main(String[] args) {
		// 무한루프
		int s, n;
		s = n = 0;
		
		for( ; ; ) { // 무한 루프. 가운데 부분에 아무것도 기술하지 않거나 true 이면 무한무프
			n++;
			s+=n;
			if(n>10) {
				break;
			}
		}
		System.out.println(s);
	}

}
