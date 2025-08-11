package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Bank implements Serializable{
	
	int ac_no;
	String name;
	float amount;
	float balance;
	public Bank(int ac_no,String name,float amount,float balance) {
		this.ac_no=ac_no;
		this.name=name;
		this.amount=amount;
		this.balance=balance;
	}
}
public class bank_serialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Bank b=new Bank(123456789,"Dhruv",5000,500000);
		Bank b1=new Bank(987654321,"abc",4000,40000);
		
		FileOutputStream fos=new FileOutputStream("bank.txt");
		ObjectOutputStream o=new ObjectOutputStream(fos);
		o.writeObject(b);
		o.writeObject(b1);
		 
		FileInputStream fin=new FileInputStream("bank.txt");
		ObjectInputStream oi=new ObjectInputStream(fin);
		Bank bank=(Bank) oi.readObject();
		Bank bank1=(Bank) oi.readObject();
		System.out.println("Account Number: " + b.ac_no + " Name: " + b.name + "Amount: " + b.amount + "Balance: " + b.balance);
		System.out.println("Account Number: " + b1.ac_no + " Name: " + b1.name + " Amount: " + b1.amount + " Balance: " + b1.balance);
	}

}
