package ch11.unit01;

public class Ex02 {
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.set("서울");
		String s = (String)t.get(); // 다운 캐스팅 필요
		System.out.println(s + ":" + s.length());
		
		Test2 t2 = new Test2();
		t2.set(100);
		Integer i = (Integer)t2.get();
		System.out.println(i);
		
		// t2.set("부산");
		// Integer i2 = (Integer)t2.get(); // 런타임 오류
	}
}

class Test2 {
	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return obj;
	}
}
