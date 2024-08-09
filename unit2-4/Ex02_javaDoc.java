package ch02.unit04;

public class Ex02_javaDoc {
	
	/*
	  - javadoc
	  	: 문서화 주석
	  	: HTML로 작성
	  - 사용 예
	  	cmd> javadoc -use -d doc Ex02_javaDoc.java
	  	
	  		doc 폴더에 HTML로 API 설명을 만들어 줌 
	  		-d : doc 폴더가 없으면 doc 폴더를 만들어줌
	 */
	
	/**
	 * 짝수인지 판별하는 메소드
	 * <p> 정수를 2로 나눈 나머지가 0이면 짝수이다. </p>
	 * @param num      짝수인지 판별하는 수<code>int</code>
	 * @return		   짝수 여부를 반환한다. <code>boolean</code>
	 */
	public boolean isEven(int num) {
		return num % 2 == 0;
		
	}
}
