package ch07.unit01;

// java.util 패키지의 모든 클래스를 import
import  java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		// Scanner : java.util 패키지에 존재
		Scanner sc = new Scanner(System.in);
		
		// Calendar : java.util 패키지에 존재
		Calendar cal = Calendar.getInstance();
		System.out.printf("%tF %tA %tT\n", cal, cal, cal);
		
		sc.close();

	}

}
