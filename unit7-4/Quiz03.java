package ch07.unit04;

/*
   - 1 ~ 100 까지 수를 한줄에 10개씩 출력
   - 숫자가 3, 6, 9 가 있는 경우 3, 6, 9 만큼 *로만 출력
     1  2  *   4  5  *  7   8  *  10
           :
    21  22 *  24 25  * 27  28  *   *
     *   * **  *  * **  *   * **  40
           :
*/
public class Quiz03 {
	public static void main(String[] args) {
		String s;
		for(int i=1; i<=100; i++) {
			s = Integer.toString(i);
			s = s.replaceAll("(3|6|9)", "*");
			
			if(s.indexOf("*") != -1) {
				s = s.replaceAll("\\d", "");
			}
			System.out.printf("%5s", s);
			
			if(i%10 == 0) System.out.println();
		}
	}
}
