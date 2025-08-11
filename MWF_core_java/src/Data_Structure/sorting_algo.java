package Data_Structure;
//tim sort algorithm is combination of merge sort and insertion sort
//It is used in desgining to perform real world data sorting
//It is default sorting algorithm in java
//It is stable sorting algorithm,meaning it maintains the relative order of records with equal keys
//It is not in place sorting algorithm,meaning it requires additional space for sorting
//It has a time complexity of O(n log n) in the worst case and O(n) in the best case
//Collections.sort() method is used to sort the elements of a collection in natural order

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//comparable interface is used to define the natural ordering of objects
//comparator interface is used to define the custom ordering of objects
//comparTo() method is used to compare two objects of same class

class Admin_Sorting implements Comparable<Admin_Sorting>{

	int id;
	String name;
	public Admin_Sorting(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(Admin_Sorting o) {
		// TODO Auto-generated method stub
		/*if(id==o.id) {
		return 0;
		}
		else if(id>o.id)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		*/
		return name.compareTo(o.name);
	}
	
}

public class sorting_algo{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Admin_Sorting> al =new ArrayList<Admin_Sorting>();
		al.add(new Admin_Sorting(4,"taest4"));
		al.add(new Admin_Sorting(9,"tey9"));
		al.add(new Admin_Sorting(1,"tet10"));
		al.add(new Admin_Sorting(3,"st"));
		al.add(new Admin_Sorting(5,"teqerst5"));
		al.add(new Admin_Sorting(2,"t2"));
		
		Iterator<Admin_Sorting> it=al.iterator();
		while(it.hasNext()) {
			Admin_Sorting a=it.next();
			System.out.println(a.id+ "  " + a.name);
		}
		System.out.println("\nAfter sorting:");
		Collections.sort(al);
		Iterator<Admin_Sorting> it1=al.iterator();
		while(it1.hasNext()) {
			Admin_Sorting a=it1.next();
			System.out.println(a.id+ "  " + a.name);
		}
		
	}

}
