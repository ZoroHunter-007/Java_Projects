package Data_Structure;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class queue_Switch_Class {
	
	int id;
	String name;
	String department;
	float sal;
	
	public queue_Switch_Class(int id,String name,String department,float sal) {
		this.id=id;
		this.name=name;
		this.department=department;
		this.sal=sal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<queue_Switch_Class> q=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		
		int ch=0;
		do {
			System.out.println("1. Add Eployee Data in Queue");
			System.out.println("2. Display Employee Data in Queue");
			System.out.println("3. Remove Employee Data from Queue");
			System.out.println("4. Search Employee Data in Queue");
			System.out.println("5. Sort Employee Data in Queue by Salary");
			System.out.println("6. Exit");
			System.out.println("Enter your choice(1-6):");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter the number of Employee:");
				int size=sc.nextInt();
				for(int i=0;i<size;i++) {
					System.out.println("Enter Employee ID"+ (i+1)+" :");
					int id=sc.nextInt();
					System.out.println("Enter Employee Name"+ (i+1)+" :");
					String name=sc.next();
					System.out.println("Enter Employee Department"+ (i+1)+" :");
					String department=sc.next();
					System.out.println("Enter Employee Salary"+ (i+1)+" :");
					float sal=sc.nextFloat();
					q.add(new queue_Switch_Class(id,name,department,sal));
					System.out.println("Employee Data Added Successfully...");
				}
				break;
				
			case 2:
				System.out.println("\nEmployee Data:");
				for(queue_Switch_Class e:q) {
					System.out.println("Employee ID: "+ e.id+" Employee Name:"+ e.name+" Employee Department:"+ e.department+" Employee Salary:"+ e.sal);
					
				}
				break;
				
			case 3:
				System.out.println("Enter Employee ID you want to remove:");
				int r_id=sc.nextInt();
				boolean fo=false;
				Iterator<queue_Switch_Class>it=q.iterator();
				while(it.hasNext()) {
					queue_Switch_Class e=it.next();
					if(e.id==r_id) {
						it.remove();
						System.out.println(r_id+" Employee Data Removed Successfully....");
						fo=true;
						break;
					}
				}
				if(!fo) {
					System.out.println(r_id+" Employee ID not found...");
					break;
				}
				break;
			case 4:
				System.out.println("Enter Employee ID you want to search:");
				int s_id=sc.nextInt();
				boolean found=false;
				Iterator<queue_Switch_Class>it1=q.iterator();
				while(it1.hasNext()) {
					queue_Switch_Class e=it1.next();
					if(e.id==s_id) {
						System.out.println("Employee ID: "+ e.id+" Employee Name:"+ e.name+" Employee Department:"+ e.department+" Employee Salary:"+ e.sal);
						found=true;
						break;
					}
				}
				if(!found) {
					System.out.println(s_id+" Employee ID not found...");
					break;
				}
				break;
				
			 case 5:
				 queue_Switch_Class highsal=q.peek();
				 for(queue_Switch_Class e:q) {
					 if(e.sal>highsal.sal) {
						 highsal=e;
						 
					 }
				 }
				 System.out.println("\nHighest Salary Employee Data:");
				 System.out.println(highsal.id+" "+highsal.name+" "+highsal.department+" "+highsal.sal);
				 break;
				
			 case 6:
				 System.exit(0);
				 break;
				 
			 default:
				 System.out.println("You Enter Wrong Choice!Please try again...");
				 break;
				 
			}
				
			
			System.out.println("Do you want to continue?:");
			ch=sc.nextInt();
		}while(ch==1);
		

	}

}
