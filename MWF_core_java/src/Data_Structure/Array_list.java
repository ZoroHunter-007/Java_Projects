package Data_Structure;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list {

	public Array_list() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(0,10);
		al.add(20);
		al.add(30);
		al.add(10);
		Iterator<Integer> it= al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//printing Foreach loop
		for(Integer i:al) {
			System.out.println("For each loop: " +i);
		}
		for(int i=0;i<al.size();i++)
		{
			System.out.println("For loop: " +al.get(i));
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Array_list();
	}

}
