package ch04.unit03.forEx;

public class Ex10 {

	public static void main(String[] args) {
		// for문의 증감에 float를 사용 할수 있지만 사용하면 안됨
		
		int s = 2000000000;
		int count = 0;
		for(float f = s; f < s + 50; f++) {
			count++;
		}
		System.out.println(count); // 0
	}

}
