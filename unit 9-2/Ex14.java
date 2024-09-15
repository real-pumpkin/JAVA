package ch09.unit02;

public class Ex14 {
	public static void main(String[] args) {
		User14 obj = new User14();
		
		obj.setValue(-5);
		
		int n = obj.getValue();
		System.out.println(n);
		
		System.out.println("end...");
	}
}

// 잘못 작성한 코드
class User14 {
	private int value;
	
	public void setValue(int value) {
		try {
			if(value < 0) {
				// 강제로 checked exception 발생
				throw new Exception("0 이상만 가능합니다.");
			}
			
			this.value = value;
		} catch (Exception e) {
			// 위에서 throw 한 예외를 이곳에서 catch 함
			
			System.out.println(e.toString());
		}
	}
	
	public int getValue() {
		return value;
	}
}

