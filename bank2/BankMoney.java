package bank2;

import java.util.Calendar;

// 입출금 관리 클래스
public class BankMoney {
	private BankBookSearch bankBookSearch = null;

	public BankMoney(BankBookSearch bankBookSearch) {
		this.bankBookSearch = bankBookSearch;
	}

	// 입금
	public long deposit(String accountNo, long amount) {
		Account account = bankBookSearch.readAccount(accountNo);
		if (account == null) {
			return -1L;
		}

		Calendar cal = Calendar.getInstance();
		String transaction_date = String.format("%1$tF %1$tT", cal);

		TransactionVO vo = new TransactionVO();
		long balance = balance(accountNo);
		balance += amount;

		vo.setTransaction_date(transaction_date);
		vo.setAmount(amount);
		vo.setBalance(balance);
		vo.setKind("입금");
		vo.setInfo("본인");

		boolean b = account.addTransaction(vo);
		if ( !b ) {
			return -2L;
		}

		return balance;
	}

	// 출금
	public long withdraw(String accountNo, String pwd, long amount) {
		Account account = bankBookSearch.readAccount(accountNo, pwd);
		if (account == null) {
			return -1L;
		}

		long balance = balance(accountNo);
		if (amount > balance) {
			return -2L;
		}

		Calendar cal = Calendar.getInstance();
		String transaction_date = String.format("%1$tF %1$tT", cal);

		TransactionVO vo = new TransactionVO();

		balance -= amount;

		vo.setTransaction_date(transaction_date);
		vo.setAmount(amount);
		vo.setBalance(balance);
		vo.setKind("출금");
		vo.setInfo("본인");

		boolean b = account.addTransaction(vo);
		if (!b) {
			return -3L;
		}

		return balance;
	}

	// 계좌이체
	public long accountTransfer(String fromAccountNo, String fromPwd, String toAccountNo, long amount) {
		// 출금할 계좌
		Account fromAccount = bankBookSearch.readAccount(fromAccountNo, fromPwd);
		if (fromAccount == null) {
			return -1L;
		}

		// 입금할 계좌
		Account toAccount = bankBookSearch.readAccount(toAccountNo);
		if (toAccount == null) {
			return -2L;
		}

		// 출금할 계좌의 잔고
		long fromBalance = balance(fromAccountNo);
		if (amount > fromBalance) {
			return -3L;
		}
		fromBalance -= amount;

		// 입금할 계좌의 잔고
		long toBalance = balance(toAccountNo);
		toBalance += amount;

		// 입/출금 일자
		Calendar cal = Calendar.getInstance();
		String transaction_date = String.format("%1$tF %1$tT", cal);

		TransactionVO fromVo = new TransactionVO();
		TransactionVO toVo = new TransactionVO();

		// 출금할 계좌의 거래 내역
		fromVo.setTransaction_date(transaction_date);
		fromVo.setAmount(amount);
		fromVo.setBalance(fromBalance);
		fromVo.setKind("출금");
		fromVo.setInfo("계좌이체");
		fromAccount.addTransaction(fromVo);
		String name = fromAccount.getAccountVO().getOwner();

		// 입금할 계좌의 거래 내역
		toVo.setTransaction_date(transaction_date);
		toVo.setAmount(amount);
		toVo.setBalance(toBalance);
		toVo.setKind("입금");
		toVo.setInfo(name);
		toAccount.addTransaction(toVo);

		// 출금한 계좌의 잔액
		return fromBalance;
	}

	// 잔액조회
	public long balance(String accountNo) {
		Account account = bankBookSearch.readAccount(accountNo);
		if (account == null) {
			return -1L;
		}

		TransactionVO vo = account.getLastTransaction();
		long balance = 0L;
		if (vo != null) {
			balance = vo.getBalance();
		}

		return balance;
	}

	public long balance(String accountNo, String pwd) {
		Account account = bankBookSearch.readAccount(accountNo, pwd);
		if (account == null) {
			return -1L;
		}

		TransactionVO vo = account.getLastTransaction();
		long balance = 0L;
		if (vo != null) {
			balance = vo.getBalance();
		}

		return balance;
	}
	
}
