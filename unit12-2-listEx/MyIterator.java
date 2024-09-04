package ch12.unit02.listEx;

public interface MyIterator<E> {
	public boolean hasNext();
	public E next();
	public void remove();
}
