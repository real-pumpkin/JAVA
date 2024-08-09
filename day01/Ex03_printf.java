package ch02.unit03;


/*
   - System.out.printf("서식" , 출력할값);
     System.out.format("서식" , 출력할값);
     : 서식에 따라 출력
     : 출력 후 라인을 넘기지 않는다
   - 변환문자 
     %d : 정수
     %f : 실수
     %s : 문자열
     %c : 문자
 */
public class Ex03_printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c; // 정수형 변수 선언
		a = 13;
		b = 4;
		
		c = a + b;
		System.out.println(c);
		System.out.println(a + "+" + b + "=" + c);
		
		System.out.printf("%d + %d = %d\n", a,b,c);
		System.out.format("%d + %d = %d\n", a,b,c);
			// %d : 변환문자, 정수를 출력
		System.out.println();

		System.out.printf("%d + %d = %d\t", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\t", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d %% %d = %d%n", a, b, a % b);
	}
}

