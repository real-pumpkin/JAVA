package ch08.unit02;

public class Ex03 {

	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		obj.setName("김자바");
		obj.setAge(20);
		
		Demo3 obj2 = new Demo3();
		obj2.setName("김자바");
		obj2.setAge(20);

		// 주소 비교
		System.out.println(obj == obj2);
		// 값비교
		System.out.println(obj.equals(obj2));
		
		System.out.println(obj);
		System.out.println(obj.toString());
		
		System.out.println(obj.getName() + "," + obj.getAge());
	}
}

class Demo3 {
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
	
	@Override
	public String toString() {
		String s = null;
		
		if(name != null) {
			s = String.format("%10s %5d", name, age);
		}
		
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		Demo3 d = (Demo3)obj;
		
		boolean b = false;
		
		if(name != null) {
			b = name.equals(d.getName()) && age == d.getAge();
		}
		
		return b;
	}
	
}
