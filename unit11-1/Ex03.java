package ch11.unit01;

public class Ex03 {
	public static void main(String[] args) {
		// Test3 obj = new Test3(); // 가능. 경고
		
		Test3<String> obj = new Test3<>();
		obj.set("서울");
		String s = obj.get();
		System.out.println(s);
		
		// obj.set(10); // 컴오류
		
		Test3<Integer> obj2 = new Test3<Integer>();
		obj2.set(100);
		int n = obj2.get();
		System.out.println(n);
		
	}
}

// Generic(하나의 타입 파라미터)
//  : 다양한 타입의 객체를 다루거나 인터페이스에서 
//    사용할 데이터 타입을 인스턴스를 생성할때 결정
//  : 객체의 타입을 컴파일할때 체크하므로 객체 타입의 안정성 보장
//  : 불필요한 형변환을 줄임
class Test3<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		System.out.println(t.getClass());
		return t;
	}
}

