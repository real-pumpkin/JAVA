package ch05.unit01;

public class Ex03 {

	public static void main(String[] args) {
		int [] a = new int[3];
		a[0] = 10; a[1] = 20; a[2] = 30;
		
		System.out.println("배열크기를 3으로 선언하고 값을 할당 한 경우...");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " "); // 10 20 30
		}
		System.out.println();
		
		System.out.println("\n배열크기를 5로 변경 후");
		a = new int[5];
			// 배열의 크기를 변경하면 이전배열은 garbage collector 의 대상이 된다.
			// 즉, 배열의 크기를 실행중 변경하면 안된다.
		a[3] = 40; a[4] = 50;
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " "); // 0 0 0 40 50
		}
		System.out.println();		

	}

}
