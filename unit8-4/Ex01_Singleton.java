package ch08.unit04;

public class Ex01_Singleton {

	public static void main(String[] args) {
		System.out.println(Test1.getInstance());
		System.out.println(Test1.getInstance());
	}
}

/*
class Test1 {
	private static Test1 instance = null;
	private Test1() {
	}
	
	public static Test1 getInstance() {
		if(instance == null) {
			 
		}
		
		return instance;
	}
}
*/

class Test1 {
	private Test1() {
	}
	
	private static class Holder {
		public static final Test1 INSTANCE = new Test1();
	}
	
	public static Test1 getInstance() {
		return Holder.INSTANCE;
	}
}
