package ch08.unit02;

public class Ex02 {

	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.setName("김자바");
		obj.setAge(20);
		
		Demo2 obj2 = new Demo2();
		obj2.setName("김자바");
		obj2.setAge(20);

		// 주소 비교
		System.out.println(obj == obj2);
		System.out.println(obj.equals(obj2));
		
		// 클래스명@해쉬코드
		System.out.println(obj);
		System.out.println(obj.toString());
		
		System.out.println(obj.getName() + "," + obj.getAge());
	}
}

class Demo2 {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
