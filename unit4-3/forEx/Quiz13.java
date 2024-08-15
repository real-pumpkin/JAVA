package ch04.unit03.forEx;

public class Quiz13 {

	public static void main(String[] args) {
		for(int a=1; a<=9; a++) {
			for(int b=1; b<=9; b++) {
				for(int c=1; c<=9; c++) {
					if(a+b+c==25) {
						System.out.printf("%d+%d+%d=%d\n",a,b,c,a+b+c);
					}
				}
			}
		}

	}

}
