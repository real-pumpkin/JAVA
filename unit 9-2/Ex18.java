package ch09.unit02;

public class Ex18 {
	public static void main(String[] args) {
		User18 obj = new User18();
		
		try {
			obj.setName("후후");
			obj.setAge(-5);
			System.out.println(obj.getName() + ":" + obj.getAge());
		} catch (NameValidException e) {
			System.out.println("이름 두자이상.");
		} catch (AgeValidException e) {
			System.out.println("나이 0이상.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end.");
	}
}

// 사용자 정의 예외 : checked exception
class NameValidException extends Exception {
	private static final long serialVersionUID = 1L;

	public NameValidException(String msg) {
		super(msg);
	}
}

class AgeValidException extends Exception {
	private static final long serialVersionUID = 1L;

	public AgeValidException(String msg) {
		super(msg);
	}
}

class User18 {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) throws NameValidException{
		if(name.length() < 2) {
			throw new NameValidException("이름은 두자 이상.");
		}
		
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws AgeValidException {
		if(age < 0) {
			throw new AgeValidException("나이는 0이상.");
		}
		this.age = age;
	}
	
	
}


