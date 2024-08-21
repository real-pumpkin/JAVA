package ch06.unit03;

public class Ex11 {
	public static void main(String[] args) {
		// int < long (o)
		// Integer < Long (X)
		byte b = 10;
		char c = 'A';
		short s = 20;
		Short ss = 25; // 클래스
		int i = 100;
		long l = 1000;
		// Long ll = 1500; // 클래스, 컴오류
		Long ll = 1500L;
		
		// 메소드를 호출할때 넘겨주는 실인수는 메소드의 매개변수보다 적거나 같아야한다.
		Test11 t = new Test11();
		
		t.print();
		t.print(b); // short, 메소드의 매개변수가 같거나 큰것중 가장 작은것
		t.print(c); // int
		t.print(s); // short
		t.print(ss); // short
		t.print(i); // int
		t.print(l); // long
		t.print(ll); // long
		System.out.println();
		
		t.write(b); // int
		t.write(c); // int
		t.write(s); // int
		t.write(ss); // Short
		t.write(i); // int
		t.write(l); // Long
		t.write(ll); // Long
		System.out.println();
		
		Integer a = 10;
		t.sub(a); // Integer는 long가 전달 받을수 있음
		
		// t.sub2(a); // 컴파일오류
			// Integer < Long (X)
	}
}

// method overloading
class Test11 {
	public void print() {
		System.out.println("인자없는 print...");
	}
	
	/*
	// 컴파일 오류 : 리턴 타입은 overloading 조건을 충족하지 못함
	public int print() {
		return 1;
	}
	*/
	
	public void print(short val) {
		System.out.println("short : " + val);
	}
	
	public void print(int val) {
		System.out.println("int : " + val);
	}
	
	public void print(long val) {
		System.out.println("long : " + val);
	}
	
	// ---------------------------
	// Wrapper class : 기본 데이터를 객체 단위로 처리할 수 있도록 클래스를 제공
	//  Character, Integer, Long, Float, Double, Byte, Short, Boolean 등
	public void write(Short val) {
		System.out.println("Short : " + val);
	}
	
	public void write(int val) {
		System.out.println("int : " + val);
	}
	
	public void write(Long val) {
		System.out.println("Long : " + val);
	}
	
	// ---------------------
	public void sub(long val) {
		System.out.println("long : " + val);
	}
	
	public void sub2(Long val) {
		System.out.println("Long : " + val);
	}
	
}
