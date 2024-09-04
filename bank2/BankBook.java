package bank2;

import java.util.Calendar;

// 계좌 관리 클래스
public class BankBook {
	private Account[] accountList; // 계좌 정보
	private int totalAccount; // 총 계좌수

	public BankBook() {
		allocation(10);
		totalAccount = 0;
	}

	private void allocation(int capacity) {
		Account[] temp = new Account[capacity];
		if (accountList != null && accountList.length > 0) {
			System.arraycopy(accountList, 0, temp, 0, accountList.length);
		}
		accountList = temp;
	}

	// 계좌 번호 만들기
	protected String generateAccountNo() {
		String s = "020-08-0000000";
		if (totalAccount > 0) {
			s = accountList[totalAccount - 1].getAccountVO().getAccountNo();
		}

		String s1 = s.substring(0, s.lastIndexOf("-"));
		String s2 = s.substring(s.lastIndexOf("-") + 1);

		int n = Integer.parseInt(s2) + 1;

		s = s1 + "-" + String.format("%07d", n);

		return s;
	}

	// 계좌 등록
	public Account addAccount(String owner, String pwd) {
		if (totalAccount >= accountList.length) {
			allocation(accountList.length + 10);
		}
		Calendar cal = Calendar.getInstance();

		String accountNo = generateAccountNo();
		String launch_date = String.format("%1$tF %1$tT", cal);

		Account account = new Account();
		AccountVO vo = account.getAccountVO();
		vo.setAccountNo(accountNo);
		vo.setOwner(owner);
		vo.setPwd(pwd);
		vo.setLaunch_date(launch_date);
		accountList[totalAccount++] = account;

		return account;
	}

	// 계좌-전체 리스트
	public Account[] getAccountList() {
		return accountList;
	}

	// 계좌-전체 계좌수
	public int getTotalAccount() {
		return totalAccount;
	}
}
