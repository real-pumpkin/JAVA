package ch09.unit02;

public class Ex16 {
	public static void main(String[] args) {
		User16 obj = new User16();
		
		/*
		obj.setValue(-5); 
			// value 가 0보다 적어 RuntimeException 발생
			// 예외를 처리하지 않아 비정상 종료
		int n = obj.getValue();
		System.out.println(n);
		*/
		
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

class User16 {
	private int value;
	
	public void setValue(int value) {
		if(value < 0) {
			// RuntimeException
			//   : 숫자가 음수인 경우 RuntimeException 예외발생
			//   : RuntimeException 은 unchecked 이므로
			//     반드시 catch 할 필요가 없다.
			throw new RuntimeException("0 이상만 가능합니다.");
		}
		
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

