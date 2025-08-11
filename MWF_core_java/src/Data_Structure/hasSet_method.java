package Data_Structure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class hasSet_method {
	int id;
	String name;
	public hasSet_method(int id,String name) {
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<hasSet_method>hs=new HashSet<hasSet_method>();
		hs.add(new hasSet_method(1,"Amit"));
		hs.add(new hasSet_method(1,"Amit"));
		hs.add(new hasSet_method(3,"Ravi"));
		Iterator<hasSet_method> it=hs.iterator();
		while(it.hasNext()) {
			hasSet_method i=it.next();
			System.out.println("ID: " + i.id + " Name: " + i.name);
		}
	}

}
