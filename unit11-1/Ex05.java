package ch11.unit01;

public class Ex05 {
	public static void main(String[] args) {
		Test5<String> t = new Test5<>();
		
		t.append("a");
		t.append("b");
		t.append("c");
		
		// 제너릭 배열은 캐스팅이 필요
		Object[] oo = t.get();
		for(int n = 0; n < t.getCount(); n++) {
			String s = (String)oo[n];
			System.out.println(s);
		}
		
	}
}

class Test5<E> {
	private E[] data;
	private int count;
	
	@SuppressWarnings("unchecked")
	public Test5() {
		// data = new E[10]; // 컴오류
		data = (E[])new Object[10];
	}
	
	public void append(E e) {
		if(count >= data.length) {
			throw new ArrayIndexOutOfBoundsException("개수 초과.");
		}
		data[count++] = e;
	}
	
	public E[] get() {
		return data;
	}
	
	public int getCount() {
		return count;
	}
	
}

