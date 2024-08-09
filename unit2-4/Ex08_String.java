package ch02.unit04;

public class Ex08_String {
	public static void main(String[] args) {
		String s1, s2, s3;
		
		s1 = "seoul";
		s2 = "korea";
		
		s3 = s1 + s2; //문자열 결합
		System.out.println(s3);
		
		s3 = ""; // 문자열 길이가 0
		System.out.println(s3);
		
		s3 = "X" + "A" + 10;
			//문자열 + 일반자료형 => 문자열로 결합
		System.out.println(s3);
		
		s3 = 'A' + 10 + "X";
			// + 는 좌측부터 연산하여 우측으로 연산하고 결과를 좌변에 대입
		System.out.println(s3); //75X
		
	}
}
