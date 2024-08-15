package ch04.unit03.forEx;

public class Quiz14 {

	public static void main(String[] args) {
		// 1-2+3-4...+9-10 = 결과
		int s = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				s += i;
				System.out.print(i + "-");
			} else {
				s -= i;
				System.out.print(i + (i==10?"=":"+"));
			}
		}
		
		System.out.println(s);

	}

}
