package Enacapsulation;

public class bank_encrptyed {

	private int ac_no;
	private String ac_name;
	private double balance;
	private  double amount;
	public int getAc_no() {
		return ac_no;
	}
	public void setAc_no(int ac_no) {
		this.ac_no = ac_no;
	}
	public String getAc_name() {
		return ac_name;
	}
	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void deposite(double amount) {
		if(amount>0)
		{
			System.out.println(amount+" Amount Deposited in your Account...");
			balance+=amount;
			
		}
		else {
			System.out.println("Enter Positive amount please...!");
		}
	}
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=this.balance) {
			System.out.println(amount+" Wihtdrawal Successfully....");
			balance-=amount;
		}
		else if(amount>this.balance)
		{
			System.out.println("Insufficient Balance in your Account...!");
		}
		else {
			System.out.println("Enter positive amount");
		}
	}
}
