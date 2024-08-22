package ch07.unit01;

// 다른 패키지의 클래스를 import
import com.util.MyChar; // 하나의 클래스를 import

public class Ex01 {
	public static void main(String[] args) {
		// import 하지 않는 다른 패키지의 클래스의 객체를 생성
		// com.util.MyChar obj = new com.util.MyChar();
		
		MyChar obj = new MyChar();
		int c = obj.ascii('A');
		System.out.println(c);
		
	}
}
