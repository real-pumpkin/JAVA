package ch07.unit04;

public class Ex10 {

	public static void main(String[] args) {
		String s;
		
		/*
		s = "SELECT hak, name, kor, eng, mat "
				+ " FROM score "
				+ " WHERE hak = ? ";
		*/

		// multiline : JDK 15 정식 스팩에 포함
		s = """
			    SELECT hak, name, kor, eng, mat 
				FROM score 
				WHERE hak = ?
			""";
		System.out.println(s);

	}

}
