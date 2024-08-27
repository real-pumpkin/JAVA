package com.di;

public class UserDisplay {
	private User user;
	
	public UserDisplay(User user) {
		this.user = user;
	}
	
	public void printAll() {
		UserVO[] list = user.listUser();
		
		System.out.println("이름\t나이\t결과");
		System.out.println("-----------------------------");
		for(int i = 0; i < user.getCount(); i++) {
			UserVO vo = list[i];
			
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getAge() + "\t");
			System.out.println(vo.getAdult());
		}
	}
}
