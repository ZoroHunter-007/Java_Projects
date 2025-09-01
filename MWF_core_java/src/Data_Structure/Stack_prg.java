//stack is used to store data in LIFO order
//Last In First Out
//Stack is used in linkedlist,arraylist,etc


package Data_Structure;

import java.util.Scanner;
import java.util.Stack;

public class Stack_prg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack<Integer>stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		System.out.println("Stack elements:"+ stack);
		
		System.out.println("Acess top element from stack:"+ stack.peek());//peek method is used to get the top element of stack without removing it
		System.out.println("Stack top element remove:"+ stack.pop());
		System.out.println("Stack elements:"+ stack);
		System.out.println("Acess top element from stack:"+ stack.peek());
		
		for(Integer i:stack) {
			System.out.println(i+" Element index value in satck:"+ stack.search(i));
		}
		System.out.println("Index of 10 in stack:" +stack.indexOf(10));
		Stack<Integer>s=new Stack<>(); 
		System.out.println("\nEnter size of stack:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter element for stack:");
			int e=sc.nextInt();
			s.push(e);
		}
		for(Integer i:s) {
			System.out.println(i);
		}
		System.out.println("Enter the element you want to remove:");
		int el=sc.nextInt();
		if(s.contains(el)) {
			s.removeElement(el);
			System.out.println(el+ " Removed Successfully from stack");
		}
		for(Integer i:s) {
			System.out.println(i);
		}
		
		System.out.println("Enter the element ou want to serach:");
		int s_el=sc.nextInt();
		if(s.contains(s_el)) {
			System.out.println(s_el+ " is present in stack ");
		}
		else {
			System.out.println(s_el+" is not present in stack");
		}
		
		
	}

}
