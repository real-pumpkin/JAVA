package ch07.unit04;

public class Quiz05 {
	public static void main(String[] args) {
		String s;
		
		s = generatePwd();
		System.out.println(s);
		
		s = generatePwd();
		System.out.println(s);
	}

	// 대문자, 소문자, 숫자, 특수문자등을 조합하여 10자리 패스워드 만들기
	public static String generatePwd() {
		StringBuilder sb = new StringBuilder();
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*_abcdefghijklmnopqrstuvwxyz";
		int n;
		
		for(int i=0; i<10; i++) {
			n = (int)(Math.random() * s.length());
			sb.append(s.charAt(n));
		}
		
		return sb.toString();
	}
	
}
