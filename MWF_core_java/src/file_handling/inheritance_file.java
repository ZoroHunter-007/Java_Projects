package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent implements Serializable {
	int a;
	public Parent(int a) {
		this.a=a;
		System.out.println(a);
	}
}
class Child extends Parent{
	int x;
	public Child(int x) {
		super(10);
		this.x=x;
		System.out.println(x);
	}
}
public class inheritance_file {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	Child c=new Child(20);
		
	FileOutputStream fos=new FileOutputStream("new_in.txt");
	ObjectOutputStream o=new ObjectOutputStream(fos);
	o.writeObject(c);
	
	FileInputStream fin=new FileInputStream("new_in.txt");
	ObjectInputStream oin=new ObjectInputStream(fin);
	Child ch=(Child)oin.readObject();
	System.out.println(ch.a +" " + ch.x);
	}

}
