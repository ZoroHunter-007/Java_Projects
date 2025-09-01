package Data_Structure;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;



public class stack_Class {
	int id;
	String name;
	String department;
	float salary;
	public stack_Class(int id,String name,String departmnt,float salary) {
		this.id=id;
		this.name=name;
		this.department=departmnt;
		this.salary=salary;
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Stack<stack_Class>st=new Stack<stack_Class>();
		int ch=0;
		
		do {
			System.out.println("1. Add Employee Data ");
			System.out.println("2. Display Employee Data ");
			System.out.println("3. Remove Employee Data you want");
			System.out.println("4. Search Employee Data ");
			System.out.println("5. Find Highest Salary Employee");
			System.out.println("6.Exit");
			
			
			System.out.println("Enter your choice(1-6):");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the number of Employee:");
				int size=sc.nextInt();
				for(int i=0;i<size;i++)
				{
					System.out.println("Enter Employee ID "+(i+1)+" :");
					int id=sc.nextInt();
					System.out.println("Enter Employee Name "+(i+1)+" :");
					String name=sc.next();
					System.out.println("Enter Employee Department "+(i+1)+" :");
					String department=sc.next();
					System.out.println("Enter Employee Salary "+(i+1)+" :");
					float salary=sc.nextFloat();
					stack_Class s=new stack_Class(id,name,department,salary);
					st.add(s);
					System.out.println("Record added successfully....");
				}
				
				break;
				
			case 2:
				for(stack_Class i:st)
				{
					System.out.println("Employee ID:"+i.id+ " Employee Name:"+ i.name +" Employee Department:"+ i.department+ " Employee Salary:"+ i.salary );
				}
				break;
				
			case 3:
				System.out.println("Enter ID you want to remove:");
				int r_id=sc.nextInt();
				Iterator<stack_Class>it=st.iterator();
				boolean f=false;
				while(it.hasNext())
				{
					stack_Class  i=it.next();
					if(i.id==r_id) {
						it.remove();
						f=true;
						System.out.println(r_id +" Removed Successfully...");
						break;
					}
				}
				if(!f) {
					System.out.println(r_id+ " Not found");
					break;
				}
				
				break;
				
			case 4:
				System.out.println("Enter ID and find its Data:");
				int s_id=sc.nextInt();
				boolean fo=false;
				Iterator<stack_Class>it1=st.iterator();
				while(it1.hasNext())
				{
					stack_Class i=it1.next();
						if(i.id==s_id) {
						System.out.println("Employee ID:"+ i.id +"  Employee Name:"+ i.name+ " Employee Department:"+ i.department+ " Employee Salary:"+ i.salary);
						fo=true;
						break;
						}
				}
					if(!fo) {
						System.out.println(s_id+ " Not found");
						break;
					}
				
				
				break;
				
			case 5:
				stack_Class highest=st.get(0);
				for(stack_Class i:st) {
					if(i.salary>highest.salary) {
						highest=i;
						
					}
				}
				System.out.println("\nHighest Salary Employee Data:");
				System.out.println("Employee ID:"+ highest.id+ " Employee Name:"+ highest.name+ " Employee Department:"+ highest.department+" Employee Salary:"+ highest.salary);
				break;
					
			case 6:
				System.exit(0);
				break;
				
			default:
				System.out.println("You Enter wrong Choice...! Please try again");
				break;
				
			}
			System.out.println("Do you want to continue?:");
			ch=sc.nextInt();
		}while(ch==1);
	}

}
