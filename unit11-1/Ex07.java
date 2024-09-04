package ch11.unit01;

public class Ex07 {
	public static void main(String[] args) {
		Test7 t = new Test7();
		t.disp("서울");
		t.disp(20);
	}
}

// generic method
class Test7 {
	public <U> void disp(U u) {
		System.out.println(u.getClass().getName()+":"+u);
	}
}
