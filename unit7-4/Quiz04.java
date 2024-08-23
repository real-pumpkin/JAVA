package ch07.unit04;

public class Quiz04 {
	public static void main(String[] args) {
		Bank bank = new Bank();
		String s;
		
		// 마지막 7자리 다음의 문자열 만들기
		s = bank.generateAccountNo();
		System.out.println(s); // 020-08-0000171
		
		s = bank.generateAccountNo();
		System.out.println(s); // 020-08-0000172

		s = bank.generateAccountNo();
		System.out.println(s); // 020-08-0000173
		
	}
}

class Bank {
	private String accountNo = "020-08-0000170";
	
	public String generateAccountNo() {
		/*
		String[] ss = accountNo.split("-");
			// ss[0] <- "020"
			// ss[1] <- "08"
			// ss[2] <- "0000170"
		int n = Integer.parseInt(ss[2]) + 1;
		accountNo = ss[0]+"-"+ss[1]+"-"+String.format("%07d", n);
		*/
		
		// String s = "    123";
		// int a = Integer.parseInt(s); // 런타임오류
		// int a = Integer.parseInt(s.trim());
		
		String s1 = accountNo.substring(0,accountNo.lastIndexOf("-")+1); // "020-08-"
		String s2 = accountNo.substring(accountNo.lastIndexOf("-")+1); // "0000170"
		
		int n = Integer.parseInt(s2) + 1;
		
		accountNo = s1 + String.format("%07d", n);
		
		return accountNo;
	}
	
}

