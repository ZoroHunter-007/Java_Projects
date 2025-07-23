package Enacapsulation;

public class bank_encap {

	private String ac_holdername;
	private double amount;
	private double balance;
	private int ac_holderno;
	public String getAc_holdername() {
		return ac_holdername;
	}
	public void setAc_holdername(String  ac_holdername) {
		this.ac_holdername = ac_holdername;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAc_holderno() {
		return ac_holderno;
	}
	public void setAc_holderno(int  ac_holderno) {
		this.ac_holderno = ac_holderno;
	}
	
	public void deposite(double amount) {
		if(amount>0)
		{
			balance+=amount;
			System.out.println(amount +"your amount is deposited");
		}
		else {
			System.out.println("Please deposite positive amount");
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=this.balance)
		{
			balance-=amount;
			System.out.println(amount +" your amount is withdrawn");
		}
		else if(amount>this.balance) {
			System.out.println("Insufficient amount in your balance");
		}
		else {
			System.out.println("Please enter positive value");
		}
	}
}
