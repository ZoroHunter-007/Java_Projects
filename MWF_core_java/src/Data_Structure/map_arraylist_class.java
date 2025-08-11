package Data_Structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map_arraylist_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String>al=new ArrayList<String>();
		String name=null;
		System.out.println("Enter total number of values:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Name"+ (i+1)+":");
			name=sc.next();
			al.add(name);
		}
		HashMap<Integer,ArrayList<String>>map=new HashMap<Integer,ArrayList<String>>();
		int id=0;
		System.out.println("Enter size of keys:");
		int s=sc.nextInt();
		for(int i=0;i<s;i++)
		{
			System.out.println("Enter key"+(i+1)+":");
			id=sc.nextInt();
			map.put(id, al);
		}
		
		System.out.println("\nPrint HashMap Data:");
		for(Map.Entry<Integer, ArrayList<String>>mapel:map.entrySet())
		{
			System.out.println(mapel.getKey()+"  "+mapel.getValue());
		}

	}

}
