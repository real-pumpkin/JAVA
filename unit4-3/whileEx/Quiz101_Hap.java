package ch04.unit03.whileEx;

/*		
	1-2+3-4... 에서 연산결과가 100이상이 되는 최소의 수와 합
*/
public class Quiz101_Hap {
	public static void main(String[] args) {
		int s, n;

		n = 0;
		s = 0;
		while (s < 100) {
			n++;

			s += n % 2 == 1 ? n : -n;
		}
		System.out.println("n : " + n + ", s : " + s);
	}
}
