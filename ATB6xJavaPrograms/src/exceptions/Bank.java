package exceptions;

public class Bank {

	private String accountNum;
	private Integer Balance;

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public Integer getBalance() {
		return Balance;
	}

	public void setBalance(Integer balance) {
		Balance = balance;
	}

	public Bank(String accountNum, Integer balance) {
		super();
		this.accountNum = accountNum;
		this.Balance = balance;

	}

	public Integer add(Bank Total) throws Exception {
		if (Total.accountNum.equalsIgnoreCase("123")) {
			throw new Exception("Same account number");
		}
		System.out.println(this.Balance);
		System.out.println(Total.Balance);
		Integer sum = this.Balance + Total.Balance;
		System.out.println(this.Balance);
		return sum;
	}

}
