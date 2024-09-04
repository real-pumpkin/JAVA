package ch11.unit01;

public class Ex08 {
	public static void main(String[] args) {
		Test8<Integer> t = new Test8<>();
		// Test8<String> t2 = new Test8<>(); // 컴오류
		
		t.set(10);
		int i = t.get();
		System.out.println(i);
	}
}

// 제한된 타입 파라미터
// Number를 상속 받은 클래스만 가능(Integer, Long, Double 등
class Test8<T extends Number> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}

