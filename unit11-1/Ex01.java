package ch11.unit01;

public class Ex01 {

	public static void main(String[] args) {
		// Object : 모든 클래스의 객체를 참조할 수 있다.(up casting)
		Object[] obj = new Object[5];
		
		obj[0] = new String("자바");
		obj[1] = new String("오라클");
		obj[2] = 90;
		obj[3] = 100;
		obj[4] = new String("스프링");
		
		// Arrays.sort(obj); // ClassCastException
		
		for(Object o : obj) {
			// String s = (String)o; // 런타임 오류
			// System.out.println(s.length());
			
			if(o instanceof String) {
				String s = (String)o;
				System.out.println(s.length());
			} else if(o instanceof Integer) {
				Integer i = (Integer)o;
				System.out.println(i);
			}
		}
		
	}

}
