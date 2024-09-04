package bank2;

// 계좌 검색 클래스
public class BankBookSearch {
	private BankBook bankBook; // 계좌 정보

	public BankBookSearch(BankBook bankBook) {
		this.bankBook = bankBook;
	}

	// 잔액조회
	public long balance(String accountNo) {
		Account account = readAccount(accountNo);
		if (account == null) {
			return -1L;
		}

		TransactionVO vo = account.getLastTransaction();
		long balance = 0;
		if (vo != null) {
			balance = vo.getBalance();
		}

		return balance;
	}

	public long balance(String accountNo, String pwd) {
		Account account = readAccount(accountNo, pwd);
		if (account == null) {
			return -1L;
		}

		TransactionVO vo = account.getLastTransaction();
		long balance = 0;
		if (vo != null) {
			balance = vo.getBalance();
		}

		return balance;
	}
	
	// 거래내역조회
	public TransactionVO[] transactionHistory(String accountNo) {
		Account account = readAccount(accountNo);
		if (account == null) {
			return null;
		}

		return account.getTransactionList();
	}

	public TransactionVO[] transactionHistory(String accountNo, String pwd) {
		Account account = readAccount(accountNo, pwd);
		if (account == null) {
			return null;
		}

		return account.getTransactionList();
	}
	
	// 계좌-번호검색
	public Account readAccount(String accountNo) {
		Account[] accountList = bankBook.getAccountList();
		int totalAccount = bankBook.getTotalAccount();
		
		for (int i = 0; i < totalAccount; i++) {
			Account account = accountList[i];
			AccountVO vo = account.getAccountVO();
			if (vo.getAccountNo().equals(accountNo)) {
				return account;
			}
		}

		return null;
	}

	public Account readAccount(String accountNo, String pwd) {
		Account[] accountList = bankBook.getAccountList();
		int totalAccount = bankBook.getTotalAccount();
		
		for (int i = 0; i < totalAccount; i++) {
			Account account = accountList[i];
			AccountVO vo = account.getAccountVO();
			if (vo.getAccountNo().equals(accountNo) && vo.getPwd().equals(pwd)) {
				return account;
			}
		}

		return null;
	}
	
	// 계좌-이름검색
	public Account[] getAccountList(String owner) {
		Account[] accountList = bankBook.getAccountList();
		int totalAccount = bankBook.getTotalAccount();
		
		Account[] accounts = new Account[totalAccount];
		int count = 0;

		for (int i = 0; i < totalAccount; i++) {
			Account account = accountList[i];
			AccountVO vo = account.getAccountVO();
			if (vo.getOwner().equals(owner)) {
				accounts[count++] = account;
			}
		}

		return accounts;
	}

}
