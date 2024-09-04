package bank2;

// 계좌정보
public class AccountVO {
	private String accountNo; // 계좌번호
	private String owner; // 소유자
	private String pwd;
	private String launch_date; // 계좌개설일자
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getLaunch_date() {
		return launch_date;
	}

	public void setLaunch_date(String launch_date) {
		this.launch_date = launch_date;
	}

	@Override
	public String toString() {
		return accountNo+"\t"+owner+"\t"+launch_date;
	}
}
