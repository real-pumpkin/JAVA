package ch03.unit01;

public class Ex06 {
	public static void main(String[] args) {
		
		String s;
		
		s = "korea" + 9 + 3;
		System.out.println(s); // korea93
		
		s = 9 + 3 + "korea";
		System.out.println(s); // 12korea
		
		s = '9' + 3 + "korea"; // '9':57
		System.out.println(s); // 60korea
	}
}
