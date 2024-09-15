package ch09.unit02;

public class Ex12 {
	public static void main(String[] args) {
		User12 obj = new User12();
		
		try {
			obj.setValue(-5);
			int n = obj.getValue();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("end...");
		
	}
}

class User12 {
	private int value;
	
	public void setValue(int value) throws Exception { // 메소드를 호출한 곳에서 catch 하도록 설정
		if(value < 0) {
			// 강제로 checked exception 발생
			throw new Exception("0 이상만 가능합니다.");
		}
		
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

