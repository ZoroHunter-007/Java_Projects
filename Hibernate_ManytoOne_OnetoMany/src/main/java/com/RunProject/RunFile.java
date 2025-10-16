package com.RunProject;



import java.util.ArrayList;

import com.Data_Dao_class.Data_Dao_Class;
import com.Model_Class.BankApp;
import com.Model_Class.TransactionApp;

public class RunFile {

	public static void main(String[] args) {
		
		TransactionApp tApp=new TransactionApp();
		/*tApp.setT_Type("Deposit");
		tApp.setAmount(50000.00);
		*/
		
		BankApp bApp=new BankApp();
		/*bApp.setAc_Number(123456);
		bApp.setAc_holdername("John Doe");
		bApp.setAc_Balance(100000.00);
		bApp.setAc_Type("Saving");
		bApp.setTApp(tApp);
		*/
		
		BankApp bApp1=new BankApp();
		/*bApp1.setAc_Number(789456);
		bApp1.setAc_holdername("Zoro Hunter");
		bApp1.setAc_Balance(10000.00);
		bApp1.setAc_Type("Withdraw");
		bApp1.setTApp(tApp);*/
		
		
		ArrayList<BankApp>al=new ArrayList<BankApp>();
	/*	al.add(bApp);
		al.add(bApp1);
		tApp.setbApp(al);*/
		
		Data_Dao_Class d=new Data_Dao_Class();
		
		/*d.ShowData(tApp);
		System.out.println("Data Save Successfully...");
		*/
	/*	d.FetchData("Deposit").forEach(i->{
			System.out.println("Transaction Type:"+i.getT_Type());
			i.getbApp().forEach(j->{
				System.out.println("Account Number:"+j.getAc_Number()+" "+"Account Holder Name:"+j.getAc_holdername()+" "+"Account Balance:"+j.getAc_Balance()+" "+"Account Type:"+j.getAc_Type());
			})	;
			
			
		});*/
		
		tApp=d.FecthDataById(1);
		System.out.println("Transaction Type:"+tApp.getT_Type());
		tApp.getbApp().forEach(j->{
			System.out.println("Account Number:"+j.getAc_Number()+" "+"Account Holder Name:"+j.getAc_holdername()+" "+"Account Balance:"+j.getAc_Balance()+" "+"Account Type:"+j.getAc_Type());
		});
		
	}
}
