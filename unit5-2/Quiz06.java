package ch05.unit02;

public class Quiz06 {

	public static void main(String[] args) {
		char [][]c = new char[4][4];
		
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				c[i][j] = (char)((Math.random() * 26) + 65);
				
				gogo:
				for(int a=0; a<=i; a++) {
					for(int b=0; b<c[a].length; b++) {
						if(a==i && b>=j) {
							break gogo;
						}
						if(c[a][b]==c[i][j]) {
							j--;
							break gogo;
						}
					} // for(int b=0_end
				} // for(int a=0_end
			} // for(int j=0_end
			
		} // for(int i=0_end
		
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.printf("%3c", c[i][j]);
			}
			System.out.println();
		}
		

	}

}
