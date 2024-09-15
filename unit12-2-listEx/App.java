package ch12.unit02.listEx;

public class App {
	public static void main(String[] args) {
		MyList<String> list = new MyArrayList<String>();
		list.add("서울");
		list.add("부산");
		list.add("인천");
		list.add(2, "대구");
		System.out.println(list);
		
		MyIterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println(list.indexOf("부산"));
		
		list.remove("인천");
		System.out.println(list);
		
		list.clear();
		System.out.println("개수:"+list.size());
	}
}
