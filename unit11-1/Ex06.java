package ch11.unit01;

public class Ex06 {
	public static void main(String[] args) {
		Test6<String> t = new Test6<>();
		t.append("A");
		t.append("B");
		t.append("C");
		
		for(int i = 0; i < t.getCount(); i++) {
			String s = t.get(i);
			System.out.println(s);
		}
	}
}

class Test6<E> {
	private Object[] data;
	private int count;
	
	public Test6() {
		data = new Object[10];
	}
	
	public void append(E e) {
		if(count >= data.length) {
			throw new ArrayIndexOutOfBoundsException("초과");
		}
		data[count++] = e;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index) {
		if(index >= count) {
			throw new ArrayIndexOutOfBoundsException("초과");
		}
		return (E)data[index];
	}
	
	public int getCount() {
		return count;
	}
	
}
