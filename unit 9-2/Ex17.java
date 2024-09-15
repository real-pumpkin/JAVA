package ch09.unit02;

public class Ex17 {
	public static void main(String[] args) {
		User17 obj = new User17();
		
		try {
			obj.set("호호", -5);
			System.out.println(obj.getName() + " : " + obj.getAge());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

class User17 {
	private String name;
	private int age;
	
	public void set(String name, int age) throws Exception {
		try {
			setName(name);
			setAge(age);
		} catch (Exception e) {
			// System.out.println(e.toString());
			
			// throw new Exception("예외발생..."); // 새로운 예외클래스를 만들어 던짐
			throw e; // 예외를 다시 던짐
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception {
		if(name.length() < 2) {
			throw new Exception("이름은 두자이상...");
		}
		
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		if(age < 0) {
			throw new Exception("나이는 0이상...");
		}
		this.age = age;
	}
}
