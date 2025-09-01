package Data_Structure;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_class {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		
		//Displaying the queue elements
		System.out.println("Queue elements:"+ queue);
		
		//Accessing the head element
		System.out.println("Head element:"+ queue.peek());
		
		//Removing the head element
		System.out.println("Removed head element:"+ queue.poll());
		
		//Remove the specific element 
		System.out.println("Remove 30 from the queue"+ queue.remove(30));
	
		System.out.println("Queue elements:"+ queue);
		
		System.out.println();
		
		System.out.println(queue.contains(20));
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		
		
		
	}
}
