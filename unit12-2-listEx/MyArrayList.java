package ch12.unit02.listEx;

public class MyArrayList<E> implements MyList<E> {
	private Object[] elementData;
	private int size;
	
	public MyArrayList() {
		// 초기 10개 메모리 할당
		capacityAllocation(10);
	}
	
	public MyArrayList(int capacity) {
		capacityAllocation(capacity);
	}
	
	private void capacityAllocation(int capacity) {
		Object[] temp = new Object[capacity];
		if(elementData != null && size > 0) {
			System.arraycopy(elementData, 0, temp, 0, size);
		}
		elementData = temp;
	}
	
	@SuppressWarnings("unchecked")
	private E elementData(int index) {
		return (E)elementData[index];
	}
	
	@Override
	public void add(E element) {
		if(size >= elementData.length) {
			capacityAllocation(elementData.length + 10);
		}
		elementData[size++] = element;
	}

	@Override
	public boolean add(int index, E element) {
		if(index < 0 || index > size) {
			return false;
		}
		
		if(size >= elementData.length) {
			capacityAllocation(elementData.length + 10);
		}
		
		for(int i = size-1; i>=index; i--) {
			elementData[i+1] = elementData[i];
		}
		
		elementData[index] = element;
		size++;
		return true;
	}

	@Override
	public E get(int index) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		return elementData(index);
	}

	@Override
	public E set(int index, E element) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		E oldValue = elementData(index);
		elementData[index] = element;
		
		return oldValue;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public E remove(int index) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		E removed = elementData(index); 
		
		for(int i = index+1; i<=size-1; i++) {
			elementData[i-1] = elementData[i];
		}
		
		size--;
		elementData[size] = null;

		return removed;
	}

	@Override
	public boolean remove(E element) {
		for(int i=0; i<size; i++) {
			if(elementData[i].equals(element)) {
				remove(i);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public void clear() {
		for(int i=0; i<size; i++) {
			elementData[i] = null;
		}
		
		size = 0;
	}

	@Override
	public int indexOf(E element) {
		for(int i=0; i<size; i++) {
			if(element.equals(elementData[i])) {
				return i;
			}
		}
		
		return -1;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		
		for(int i=0; i<size; i++) {
			if(i != size-1) {
				sb.append(elementData[i] + ", ");
			} else {
				sb.append(elementData[i]);
			}
		}
		
		sb.append("]");
		
		return sb.toString();
	}

	@Override
	public MyIterator<E> iterator() {
		return new MyIteratorImpl();
	}
	
	// 반복자 인터페이스 구현
	private class MyIteratorImpl implements MyIterator<E> {
		private int nextIndex = 0;
		
		@Override
		public boolean hasNext() {
			return nextIndex < size();
		}

		@Override
		public E next() {
			return elementData(nextIndex++);
		}

		@Override
		public void remove() {
			MyArrayList.this.remove(nextIndex-1);
			nextIndex--;
		}
	}

}
