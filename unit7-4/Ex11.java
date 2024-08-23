package ch07.unit04;

/*
  - StringBuilder, StringBuffer
    : 가변적인 문자열을 처리하는 경우 사용
    : 가변적인 문자열을 처리하는 경우 String 보다 빠름
    : 가변적인 문자열을 처리하지 않는 경우에는 String 을 사용
    : StringBuilder 나 StringBuffer는 마지막에 String로 변환하여 사용한다.
    
  - StringBuilder
    : 동시성을 지원하지 않음
    : 멀티 스레드 환경에서 안전하지 않음
    : StringBuffer 보다 빠름
    
  - StringBuffer
    : 동시성을 지원
    : 멀티 스레드 환경에서 안전
*/

public class Ex11 {

	public static void main(String[] args) {
		// 아래처럼 코딩하면 욕먹고 쫒겨난다.
		/*
		String s = "서울";
		s += "부산";
		s += "인천";
		*/
		
		StringBuilder sb = new StringBuilder("서울");
		StringBuilder sb2 = new StringBuilder("서울");
		
		System.out.println(sb); // 서울
		System.out.println(sb2); // 서울
		
		System.out.println(sb == sb2); // 주소. false
		System.out.println(sb.equals(sb2)); // 주소. false
		
		// 문자열 비교
		System.out.println(sb.toString().equals(sb2.toString()));
			// true
		
		String s1 = "서울";
		String s2 = "서울";
		System.out.println(s1 == s2); // 주소. true
		// System.out.println(s1 == sb); // 컴오류
		
		// 문자열 비교
		System.out.println(sb.toString().equals(s1)); // true
		System.out.println("다른객체의문자열비교:" + s1.contentEquals(sb)); // true
		
		// 문자열의 길이
		System.out.println(sb.length()); 
		
		StringBuilder sb3 = new StringBuilder();
		System.out.println("버퍼의 크기 : " + sb3.capacity()); // 16
		
		// 뒤에 문자열을 추가
		sb3.append("seoul");
		sb3.append("korea");
		sb3.append("seoul");
		sb3.append("우리나라");
		sb3.append("대한민국");

		System.out.println(sb3);
		
		System.out.println("버퍼의 크기 : " + sb3.capacity()); // 34
		System.out.println(sb3.indexOf("korea")); // 5
		
		String s = sb3.toString().toUpperCase();
		System.out.println(s);
		
		sb3.insert(0, "한국");
		System.out.println(sb3);
		
		sb3.insert(sb3.indexOf("korea") + "korea".length(), "사랑");
		System.out.println(sb3);
		
		// seoul 삭제
		// delete(s, e) : s인덱스에서 e-1인덱스까지 삭제
		sb3.delete(sb3.indexOf("seoul"), sb3.indexOf("seoul")+"seoul".length());
		System.out.println(sb3);
		
		System.out.println("문자열길이:"+sb3.length());
		System.out.println("버퍼크기:"+sb3.capacity());
		// 버퍼의 크기를 문자열 길이로
		sb3.trimToSize();
		System.out.println("버퍼크기:"+sb3.capacity());
		
		// 모두 지우기
		sb3.delete(0, sb3.length());
		System.out.println("삭제후:"+sb3);
	}

}
