package java_identifier;

public class static_counter {

	static int count = 0; // Static variable to keep track of the count
	
	public static_counter() {
		count++; // Increment the count
		System.out.println("Count: " + count); // Print the current count
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new static_counter(); // Create first object
		new static_counter(); // Create second object
		new static_counter(); // Create third object

	}

}
