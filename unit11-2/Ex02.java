package ch11.unit02;

public class Ex02 {
	public static void main(String[] args) {
		Test2<Integer> obj = new Test2<>();
		Integer a = 10;
		obj.set(a);
		disp(obj);
		
		// Test2<Number> tt = obj; // 컴오류. 상속관계가 아님
		
		Test2<String> obj2 = new Test2<>();
		obj2.set("서울");
		disp(obj2);
	}
	
	/*
	  - 제네릭 와일드 카드
	    ? : 모든 클래스나 인터페이스 가능
	      : 제네릭 타입에 의존적이지 않는 메소드등을 호출할때 사용
	 */
	public static void disp(Test2<?> t) {
		// t.set(10); // 컴오류
		t.print();
	}
}

class Test2<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	public void print() {
		System.out.println(t);
	}
}

