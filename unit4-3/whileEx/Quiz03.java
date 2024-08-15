package ch04.unit03.whileEx;

public class Quiz03 {

	public static void main(String[] args) {
		char c = 'A';
		int n = 0;
		while(c <= 'Z') {
			n++;
			
			// System.out.print(c + (n%5==0?"\n":"\t"));
			
			System.out.print(c + "\t");
			if(n%5==0) System.out.println();
			
			c++;
		}

		
	}

}
