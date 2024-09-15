package ch12.unit02.listEx;

public interface MyList<E> {
	public void add(E element); // 마지막에 데이터 추가
	public boolean add(int index, E element); // 특정 인덱스에 데이터 추가
	
	public E get(int index); // 특정 인덱스의 값 반환 
	public E set(int index, E element); // 특정 인덱스의 값 수정
	
	public int size(); // 요소개수
	
	public E remove(int index); // 인덱스의 데이터 삭제
	public boolean remove(E element); // 요소 삭제
	public void clear(); // 모두 지우기
	
	public int indexOf(E element);
	
	public MyIterator<E> iterator();
}
