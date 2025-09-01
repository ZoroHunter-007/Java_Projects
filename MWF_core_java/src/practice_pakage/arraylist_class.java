package practice_pakage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

class id_sort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		arraylist_class a1=(arraylist_class)o1;
		arraylist_class a2=(arraylist_class)o2;
		return Integer.compare(a1.id, a2.id);
	}
	
}
class name_sort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		arraylist_class a1=(arraylist_class)o1;
		arraylist_class a2=(arraylist_class)o2;
		return a1.name.compareTo(a2.name);
	}
	
}
class city_sort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		arraylist_class a1=(arraylist_class)o1;
		arraylist_class a2=(arraylist_class)o2;
		return a1.city.compareTo(a2.city);
	}
	
}
class pincode_sort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		arraylist_class a1=(arraylist_class)o1;
		arraylist_class a2=(arraylist_class)o2;
		return Integer.compare(a1.pincode, a2.pincode);
	}
	
}
public class arraylist_class {

	int id;
	String name;
	String city;
	int pincode;
	public arraylist_class(int id,String name,String city,int pincode) {
		this.id=id;
		this.name=name;
		this.city=city;
		this.pincode=pincode;
	}
	public static void main(String[] args) {
		
		ArrayList<arraylist_class>al=new ArrayList<arraylist_class>();
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("1. Add Data into ArrayList");
			System.out.println("2. Display Data into ArrayList");
			System.out.println("3. Sort by id");
			System.out.println("4. Sort by name");
			System.out.println("5. Sort by city");
			System.out.println("6. Sort by pincode");
			System.out.println("7. Exit");
			System.out.println("Enter your choice(1-7):");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1: 
				System.out.println("Enter the number Employee:");
				int size=sc.nextInt();
				for(int i=0;i<size;i++) {
					System.out.println("Enter Employee ID:");
					int id=sc.nextInt();
					System.out.println("Enter Employee Name:");
					String name=sc.next();
					System.out.println("Enter Employee City:");
					String city=sc.next();
					System.out.println("Enter the Pincode:");
					int pincode=sc.nextInt();
					
					al.add(new arraylist_class(id, name, city, pincode));
					System.out.println("Record Added Successfully....");
				}
				break;
				
			case 2:
				Iterator<arraylist_class>it=al.iterator();
				while(it.hasNext()) {
					arraylist_class a=it.next();
					{
						System.out.println("Employee ID:"+a.id+ " Employee Name:"+ a.name+ " Employee City:"+ a.city+ " Pincode:"+a.pincode);
					}
				}
				break;
				
			case 3:
				System.out.println("Employee Data Sorted by ID");
				Collections.sort(al, new id_sort());
				for(arraylist_class a:al) {
					System.out.println("Employee ID:"+a.id+ " Employee Name:"+ a.name+ " Employee City:"+ a.city+ " Pincode:"+a.pincode);
				}
				break;
				
			case 4:
				System.out.println("Employee Data Sorted by Name");
				Collections.sort(al, new name_sort());
				for(arraylist_class a:al) {
					System.out.println("Employee ID:"+a.id+ " Employee Name:"+ a.name+ " Employee City:"+ a.city+ " Pincode:"+a.pincode);
				}
				break;
				
			case 5:
				System.out.println("Employee Data Sorted by City");
				Collections.sort(al, new city_sort());
				for(arraylist_class a:al) {
					System.out.println("Employee ID:"+a.id+ " Employee Name:"+ a.name+ " Employee City:"+ a.city+ " Pincode:"+a.pincode);
				}
				break;
				
			case 6:
				System.out.println("Employee Data Sorted by Pincode");
				Collections.sort(al, new pincode_sort());
				for(arraylist_class a:al) {
					System.out.println("Employee ID:"+a.id+ " Employee Name:"+ a.name+ " Employee City:"+ a.city+ " Pincode:"+a.pincode);
				}
				break;
				
			case 7:
				System.exit(0);
				break;
			
			default:
				System.out.println("Invalid Choice...!Please enter valid choice");
				break;
			}
			System.out.println("Do you want to Continue?(0-1):");
			ch=sc.nextInt();
			
		}while(ch==1);
		
	}
}
