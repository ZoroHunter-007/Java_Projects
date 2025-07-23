package Enacapsulation;

public class call_bank_cap {

	public static void main(String[] args) {
		bank_encap be=new bank_encap();
		be.setAc_holdername("Dhruv");
		be.setAc_holderno(12345678);
		be.setAmount(50000);
		be.setBalance(100000);
		
		System.out.println("Account HolderName: " +be.getAc_holdername());
		System.out.println("Account HolderNumber: " +be.getAc_holderno());
		System.out.println("Balance: " +be.getBalance());	
		be.deposite(5000);
		be.withdraw(10000);
		
		System.out.println("Balance after Deposited and withdrawn: "+ be.getBalance());
		
	}

}
