package ch09.unit02;

public class Ex13 {
	public static void main(String[] args) throws Exception {
		User13 obj = new User13();
		
		/*
		  위 처럼 main() 메소드에서 throws 할 경우 예외가 발생하면
		    프로그램이 비 정상적으로 종료 된다.
		*/
		obj.setValue(-5);
		
		int n = obj.getValue();
		System.out.println(n);
		
		System.out.println("end...");
	}
}

class User13 {
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

