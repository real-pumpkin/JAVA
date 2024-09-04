package ch11.unit02;

public class Ex01 {
	public static void main(String[] args) {
		Test1<Number> t1 = new Test1<>();
		Integer a = 10;
		t1.set(a); // 타입 매개변수는 상속관계가 성립
		System.out.println(t1.get());

		// Integer b = t1.get(); // 컴오류
		// Integer b = (Integer)t1.get(); // 가능
		
		Test1<Integer> t2 = new Test1<>();
		Integer n = 10;
		t2.set(n);
		
		// Test1<Number> t3 = t2; // 컴오류
			// 제네릭은 상속관계가 아님.
			// 업캐스팅 불가
		
	}
}

class Test1<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
