package ch06.unit04;

public class Ex11 {
	public static void main(String[] args) {
		// Test11 t = new Test11(); // 컴오류. 생성자가 private 이므로
		
		Test11 t1 = Test11.getInstance();
		Test11 t2 = Test11.getInstance();
		
		t1.add();
		t1.add();
		t1.add();

		int n = t2.add();
		System.out.println(n);
		
	}
}

// singleton 패턴 : 하나의 객체만 생성
class Test11 {
	private static Test11 tt = null;
	
	private int num = 0;
	
	private Test11() {
	}
	
	public static Test11 getInstance() {
		if(tt == null) {
			tt = new Test11();
		}
		
		return tt;
	}
	
	public int add() {
		return ++num;
	}
	
	public int sub() {
		return --num;
	}
}

