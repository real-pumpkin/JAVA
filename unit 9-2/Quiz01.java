package ch09.unit02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz01 {
	public static void main(String[] args) {
		Calc obj = new Calc();
		obj.calc();
	}
}

class OperatorException extends Exception {
	private static final long serialVersionUID = 1L;

	public OperatorException(String msg) {
		super(msg);
	}
}

class Calc {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void calc() {
		int a, b;
		String op, s;
		
		try {
			System.out.print("첫번째 수 ? ");
			a = Integer.parseInt(br.readLine());
			
			System.out.print("두번째 수 ? ");
			b = Integer.parseInt(br.readLine());
			
			System.out.print("연산자 ? ");
			op = inputOperator();
			
			s = result(a, b, op);
			
			System.out.println(s);
			
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력 가능합니다.");
		} catch (OperatorException e) {
			System.out.println("연산자 입력 오류 입니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	protected String inputOperator() 
			throws OperatorException, IOException {
		String op = null;
		
		op = br.readLine();
		
		if( ! op.matches("(\\+|\\-|\\*|\\/)")) {
			throw new OperatorException("연산자 입력 오류 ...");
		}
		
		return op;
	}
	
	protected String result(int a, int b, String op) {
		String s = null;
		
		try {
			s = switch (op) {
			case "+" -> String.format("%d+%d=%d", a,b,a+b);
			case "-" -> String.format("%d-%d=%d", a,b,a-b);
			case "*" -> String.format("%d*%d=%d", a,b,a*b);
			default -> String.format("%d/%d=%d", a,b,a/b);
			};
		} catch (Exception e) {
			throw e;
		}
		
		return s;
	}
	
}


