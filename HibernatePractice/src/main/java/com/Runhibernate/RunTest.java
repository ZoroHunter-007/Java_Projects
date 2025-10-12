package com.Runhibernate;

import com.DaoClass.Dao_Class;
import com.TestHibernate.Bank;
import com.TestHibernate.Transaction;

public class RunTest {

	public static void main(String[] args) {
		
		Transaction t=new Transaction();
		/*t.setT_id(1167);
		t.setT_type("Withdraw");
		t.setT_amount(50000.00);
		System.out.println("Transaction Details:"+t);
		*/
		Bank b=new Bank();
		/*b.setAc_number(114598);
		b.setAc_name("tetest1234");
		b.setAc_type("Current");
		b.setAc_balance(98006.00);
		b.setTransa(t);
		System.out.println("Bank Details: "+b);*/
		
		Dao_Class d=new Dao_Class();
		//d.InsertData(b);
		//d.UpdateData(b);
		//d.DeleteData(b);
		//System.out.println("Data Inserted Successfully....");
		/*b=d.FetchDataByAc_number(123456);
		System.out.println(b.getAc_balance()+" "+b.getAc_name()+" "+b.getAc_type());*/
		
		d.ShowAllData().forEach(i->{
			System.out.println(i.getAc_number()+" "+i.getAc_balance()+" "+i.getAc_name()+" "+i.getAc_type());
			System.out.println("\n");
		});		
	}
}
