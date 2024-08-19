package ch05.unit03;


/*
  - a배열 : 배열의 배열
    |주소1|  ---> |  10 |  20  |  30  | 
    |주소2|  ---> |  40 |  50  |  60  |
    
   a 배열을 b 배열로 System.arraycopy() 로 복사하면 실제 값이 저장된
   주소가 복사되며
   b 배열의 원소의 값을 변경하면 a 배열의 원소의 값도 변경된다.  
*/

public class Ex03 {

	public static void main(String[] args) {
		int [][]a = new int[][] {{10,20,30},{40,50,60}};
		int [][]b = new int[2][3];
		
		System.arraycopy(a, 0, b, 0, b.length); // 주소 2개가 복사
		
		System.out.println("a 배열...");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
		}
		System.out.println();
		
		System.out.println("b 배열...");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.printf("%3d", b[i][j]);
			}
		}
		System.out.println();
		
		b[1][1] = 500;
		System.out.println(a[1][1] + ":" + b[1][1]); // 500:500
		
		

	}

}
