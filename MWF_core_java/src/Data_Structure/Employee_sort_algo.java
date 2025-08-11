/*
 * Employee Sorting System (Menu-Based, No Map)
👩‍💼 Employee Fields:
int id

String name

String department

double salary

🎯 Functionality:
Accept employee data via Scanner.

Display a menu:

Sort by Name (A–Z)

Sort by Department (A–Z)

Sort by Salary (High to Low)

Sort and display accordingly.

*/
package Data_Structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

class employee{
	int id;
	String name;
	String department;
	double salary;
	public employee(int id,String name,String department,double salary) {
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
}
class id_choice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		employee e1=(employee)o1;
		employee e2=(employee)o2;
		
		return Integer.compare(e1.id, e2.id);
	}
	
}
class name_choice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		employee e1=(employee)o1;
		employee e2=(employee)o2;
		return e1.name.compareToIgnoreCase(e2.name);
	}
	
}
class depart_choice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		employee e1=(employee)o1;
		employee e2=(employee)o2;
		return e1.department.compareToIgnoreCase(e2.department);
	}
	
}
class salary_choice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		employee e1=(employee)o1;
		employee e2=(employee)o2;
		return Double.compare(e2.salary, e1.salary);
	}
	
}

public class Employee_sort_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<employee>al=new ArrayList<employee>();
		Scanner sc=new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("1.Enter Employee Data");
			System.out.println("2.Sort by name(A-Z)");
			System.out.println("3.Sort by Department(A-Z)");
			System.out.println("4.Sort by salary(High to Low)");
			System.out.println("5.Sort by ID");
			System.out.println("6.Exit");
			System.out.println("Enter your choice(1-5):");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter total number of Employees:");
				int size=sc.nextInt();
				for(int i=0;i<size;i++) {
					System.out.println("Enter Employee ID "+(i+1)+":");
					int id=sc.nextInt();
					System.out.println("Enter Employee Name "+(i+1)+":");
					String name=sc.next();
					System.out.println("Enter Employee Department "+(i+1)+":");
					String department=sc.next();
					System.out.println("Enter Employee Salary "+(i+1)+":");
					double salary=sc.nextDouble();
					System.out.println();
					al.add(new employee(id,name,department,salary));
				}
				break;
				
			case 2:
				Collections.sort(al,new name_choice());
				Iterator<employee>it=al.iterator();
				while(it.hasNext()) {
					employee e=it.next();
					System.out.println(e.id +" "+ e.name +" "+e.department+ " "+e.salary);
				}
				break;
			
			case 3:
				Collections.sort(al,new depart_choice());
				Iterator<employee>it1=al.iterator();
				while(it1.hasNext()) {
					employee e=it1.next();
					System.out.println(e.id +" "+ e.name +" "+e.department+ " "+e.salary);
				}
				break;
				
			case 4:
				Collections.sort(al,new salary_choice());
				Iterator<employee>it2=al.iterator();
				while(it2.hasNext()) {
					employee e=it2.next();
					System.out.println(e.id +" "+ e.name +" "+e.department+ " "+e.salary);
				}
				break;
				
			case 5:
				Collections.sort(al,new id_choice());
				Iterator<employee>it4=al.iterator();
				while(it4.hasNext()) {
					employee e=it4.next();
					System.out.println(e.id +" "+ e.name +" "+e.department+ " "+e.salary);
				}
				break;
				
			case 6:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice by user!");
				break;
			}
			System.out.println("Do you want to continue(press 1 for yes and 0 for no):");
			ch=sc.nextInt();
		}while(ch==1);

	}

}
