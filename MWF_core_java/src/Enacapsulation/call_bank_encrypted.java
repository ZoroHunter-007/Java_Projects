package Enacapsulation;
import java.util.Scanner;

public class call_bank_encrypted extends bank_encrptyed{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Holder No:");
		int ac_no=sc.nextInt();
		System.out.println("Enter Account Holder Name:");
		String name=sc.next();
		System.out.println("Enter Deposite Amount:");
		double amount=sc.nextDouble();
		System.out.println("Enter Withdrwal Amount:");
		double w_amount=sc.nextDouble();
		System.out.println("Enter your Balance:");
		double balance=sc.nextDouble();
		
		call_bank_encrypted cbe=new call_bank_encrypted();
		cbe.setAc_no(ac_no);
		cbe.setAc_name(name);
		cbe.setAmount(amount);
		cbe.setBalance(balance);
		
		System.out.println("Account Holder No:"+ cbe.getAc_no());
		System.out.println("Account Holder Name:"+ cbe.getAc_name());
		System.out.println("Account Holder Balance:"+ cbe.getBalance());

		cbe.deposite(amount);
		cbe.withdraw(w_amount);
		System.out.println("After Transcation Your Balance:"+ cbe.getBalance());
		
		
	}
}
