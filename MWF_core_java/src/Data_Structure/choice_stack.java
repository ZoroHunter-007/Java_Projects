package Data_Structure;

import java.util.Scanner;
import java.util.Stack;

public class choice_stack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack<Integer>stack=new Stack<>();
		int ch=0;
		do {
			System.out.println("1. Push element in Stack");
			System.out.println("2. Remove Element from Stack");
			System.out.println("3. Search elemnt in Stack");
			System.out.println("4. Display Stack");
			System.out.println("5. Find Top Element in Stack");
			System.out.println("6. Exit");
			System.out.println("Enter your choice(1-5):");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the size of Stack:");
				int size=sc.nextInt();
				for(int i=0;i<size;i++) {
					System.out.println("Enter Element " +(i+1)+" : ");
					int e=sc.nextInt();
					stack.push(e);
				}
				break;
				
			case 2:
				System.out.println("Enter the element you want to remove:");
				int r=sc.nextInt();
				if(stack.contains(r)) {
					stack.removeElement(r);
					System.out.println(r +" Removed Successfully from Stack");
				}
				else
				{
					System.out.println(r+ " is not present in stack");
					
				}
				break;
				
			case 3:
				System.out.println("Enter the element you want to search:");
				int s_el=sc.nextInt();
				if(stack.contains(s_el)) {
					System.out.println(s_el+ " is present in stack");
				}
				else {
					System.out.println(s_el+" is not present in stack");
				}
				break;
				
			case 4:
				System.out.println("\nPrinting Stack elements:");
				for(Integer i:stack) {
					System.out.println("Elements:" +i);
				}
				break;
				
			case 5:
				System.out.println("Top Element in stack is:"+ stack.peek());
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
