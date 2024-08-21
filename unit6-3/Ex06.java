package ch06.unit03;

public class Ex06 {
	public static void main(String[] args) {
		Test6 t = new Test6(); // t의 x<-0
		Test6 t2 = new Test6(); // t2의 x<-0
		
		t.x = 10; // t의 x<-10
		t2.x = 10; // t2의 x<-10
		t.sub(); // t의 x<-10+5
		System.out.println(t.x + ":" + t2.x); // 15 : 10
		
		t.x = 10; // t의 x<-10
		t2.x = 10; // t2의 x<-10
		t.sub2(t2);
		System.out.println(t.x + ":" + t2.x); // 30 : 15
	}
}

class Test6 {
	int x;
	
	public void sub() {
		x += 5; // 호출한 객체것
	}
	
	public void sub2(Test6 tt) {
		x += 20; // 호출한 객체것
		tt.x += 5;
	}
}

