package practice_pakage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Bank implements Serializable{
	int ac_no;
	String name;
	Double balance;
	
	public Bank(int ac_no,String name,Double balance)
	{
		this.ac_no=ac_no;
		this.name=name;
		this.balance=balance;
	}
		
	
}
public class file_prg {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Bank b1=new Bank(123456,"Dhruv",600000.00);
		
		FileOutputStream fos=new FileOutputStream("Bank_1.txt");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		os.writeObject(b1);
		
		FileInputStream fis=new FileInputStream("Bank_1.txt");
		ObjectInputStream oi=new ObjectInputStream(fis);
		Bank b=(Bank)oi.readObject();
		System.out.println("Account Number:"+ b.ac_no+ " Name :"+b.name+" Balance:"+b.balance);
		
	}

}
