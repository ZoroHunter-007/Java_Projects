package Data_Structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class user_queue_choice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Queue<Integer>queue=new LinkedList<>();
		int ch=0;
		do {
			System.out.println("1. Add element in Queue");
			System.out.println("2. Remove Element from Queue");
			System.out.println("3. Search elemnt in Stack");
			System.out.println("4. Display Queue");
			System.out.println("5. Find Top Element in Queue");
			System.out.println("6. Exit");
			System.out.println("Enter your choice(1-5):");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the size of Queue:");
				int size=sc.nextInt();
				for(int i=0;i<size;i++) {
					System.out.println("Enter Element " +(i+1)+" : ");
					int e=sc.nextInt();
					queue.add(e);
				}
				break;
				
			case 2:
				System.out.println("Enter the element you want to remove:");
				int r=sc.nextInt();
				if(queue.contains(r)) {
					queue.remove(r);
					System.out.println(r +" Removed Successfully from Queue");
				}
				else
				{
					System.out.println(r+ " is not present in Queue");
					
				}
				break;
				
			case 3:
				System.out.println("Enter the element you want to search:");
				int s_el=sc.nextInt();
				if(queue.contains(s_el)) {
					System.out.println(s_el+ " is present in Queue");
				}
				else {
					System.out.println(s_el+" is not present in Queue");
				}
				break;
				
			case 4:
				System.out.println("\nPrinting Queue elements:");
				for(Integer i:queue) {
					System.out.println("Elements:" +i);
				}
				break;
				
			case 5:
				System.out.println("Top Element in Queue is:"+ queue.peek());
				break;
				
			case 6:
				System.exit(0);
				break;
				
			default:
				System.out.println("You enterd wrong choice please try again...");
				break;
				
			}
			System.out.println("Do you want to continue?:");
			ch=sc.nextInt();
		}while(ch==1);
	}

}
