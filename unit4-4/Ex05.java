package ch04.unit04;

public class Ex05 {

	public static void main(String[] args) {
		int i, j, k;
		
		i = j = k = 0;
		
		jump:
		while(true) {
			i++;
			while(true) {
				j++;
				while(true) {
					k++;
					if((i+j+k) >= 10) {
						break jump;
					}
					System.out.println(i+","+j+","+k);
				}
			}
		}
		
	}

}
