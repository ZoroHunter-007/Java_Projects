package java_identifier;

public class this_const {

	public this_const() {
		System.out.println("Default constructor");
	}
	public this_const(int id) {
		this(); // Calling the default constructor
		System.out.println("Parameterized constructor with id: " + id);
	}
	public this_const(int id, String name) {
		this(10); // Calling the parameterized constructor with id
		System.out.println("Parameterized constructor with id: " + id + " and name: " + name);
	}
	public static void main(String[] args) {
		this_const t1 = new this_const(20,"Dhruv"); // Creating an object using the default constructor
	}

}
