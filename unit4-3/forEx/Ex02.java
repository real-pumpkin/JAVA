package ch04.unit03.forEx;

public class Ex02 {

	public static void main(String[] args) {
		int n;
/*		
    1) n <-1 
    2) n <= 10 : 참
    3) System.out.print(n + " "); // 1
    
    4) n++ : n <- 2
    5) n <= 10 : 참
    6) System.out.print(n + " "); // 2
    
    7) n++ : n <- 3
    8) n <= 10 : 참
    9) System.out.print(n + " "); // 3
    10) if(n % 3 == 0) : 참, n <- 3 + 5 : 8
    
    11) n++ : n <- 9
    12) n <= 10 : 참
    13) System.out.print(n + " "); // 9
    14) if(n % 3 == 0) : 참, n <- 9 + 5 : 14
    
    15) n++ : n <- 15
    16) n <= 10 : 거짓
*/
		for(n = 1; n <= 10; n++) {
			System.out.print(n + " "); // 1 2 3 9
			
			if(n % 3 == 0) {
				n += 5;
				// 반복횟수에 사용된 변수의 값을 변경 하면 반복횟수가 변한다.
			}
		}
		System.out.println("\n밖 : " + n); // 15

	}

}
