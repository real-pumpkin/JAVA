package bank2;

public class Bank {
	private BankBook bankBook = new BankBook(); // 계좌 관리 클래스
	private BankBookSearch bankBookSearch = null; // 계좌 검색 클래스
	private BankMoney bankMoney = null; // 계좌 입출금 클래스

	public Bank() {
		bankBookSearch = new BankBookSearch(bankBook);
		bankMoney = new BankMoney(bankBookSearch);
	}

	// 계좌 등록
	public Account addAccount(String owner, String pwd) {
		Account account = bankBook.addAccount(owner, pwd);
		return account;
	}

	// 입금
	public long deposit(String accountNo, long amount) {
		long balance = bankMoney.deposit(accountNo, amount);
		return balance;
	}

	// 출금
	public long withdraw(String accountNo, String pwd, long amount) {
		long balance = bankMoney.withdraw(accountNo, pwd, amount);
		return balance;
	}

	// 계좌이체
	public long accountTransfer(String fromAccountNo, String fromPwd, String toAccountNo, long amount) {
		long fromBalance = bankMoney.accountTransfer(fromAccountNo, fromPwd, toAccountNo, amount);

		// 출금한 계좌의 잔액
		return fromBalance;
	}

	// 잔액조회
	public long balance(String accountNo) {
		long balance = bankMoney.balance(accountNo);
		return balance;
	}

	public long balance(String accountNo, String pwd) {
		long balance = bankMoney.balance(accountNo, pwd);
		return balance;
	}
	
	// 거래 내역
	public TransactionVO[] transactionHistory(String accountNo) {
		return bankBookSearch.transactionHistory(accountNo);
	}

	public TransactionVO[] transactionHistory(String accountNo, String pwd) {
		return bankBookSearch.transactionHistory(accountNo, pwd);
	}
	
	// 계좌-번호검색
	public Account readAccount(String accountNo) {
		return bankBookSearch.readAccount(accountNo);
	}

	public Account readAccount(String accountNo, String pwd) {
		return bankBookSearch.readAccount(accountNo, pwd);
	}
	
	// 계좌-이름검색
	public Account[] getAccountList(String owner) {
		return bankBookSearch.getAccountList(owner);
	}

	// 계좌-전체 리스트
	public Account[] getAccountList() {
		return bankBook.getAccountList();
	}

	// 계좌-전체 계좌수
	public int getTotalAccount() {
		return bankBook.getTotalAccount();
	}
}
