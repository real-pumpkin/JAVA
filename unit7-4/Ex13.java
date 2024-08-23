package ch07.unit04;

public class Ex13 {
	public static void main(String[] args) {
		Test13 t = new Test13();
		
		t.stringTest();
		t.stringBufferTest();
		t.stringBuilderTest();
	}
}

class Test13 {
	public void stringTest() {
		System.out.println("String ...");
		
		long start = System.currentTimeMillis();
		String s = "a";
		for(int i=0; i<100000; i++) {
			s += "a";
		}
		long end = System.currentTimeMillis();
		
		System.out.println("길이:"+s.length() + 
				", 처리시간:" +(end-start)+"ms");
		System.out.println();
	}

	public void stringBufferTest() {
		System.out.println("StringBuffer ...");
		
		long start = System.currentTimeMillis();
		StringBuffer s = new StringBuffer("a");
		for(int i=0; i<100000; i++) {
			s.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.println("길이:"+s.length() + 
				", 처리시간:" +(end-start)+"ms");
		System.out.println();
	}
	
	public void stringBuilderTest() {
		System.out.println("StringBuilder ...");
		
		long start = System.currentTimeMillis();
		StringBuilder s = new StringBuilder("a");
		for(int i=0; i<100000; i++) {
			s.append("a");
		}
		long end = System.currentTimeMillis();
		
		System.out.println("길이:"+s.length() + 
				", 처리시간:" +(end-start)+"ms");
		System.out.println();
	}	
}
