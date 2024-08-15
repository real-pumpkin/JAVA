package ch04.unit03.whileEx;

public class Quiz07 {

	public static void main(String[] args) {
		int x = 100, y = 0;
		int s = 0;
		
		while(x >= y) {
			s++;
			x += 2;
			y += 5;
		}
		
		System.out.println("x:"+x+", y:"+y);
		System.out.println("시간 : " + s + "초");
	}

}
