package java_identifier;

public class this_modifier {

	int id;
	String name;
	public this_modifier(int id, String name) {
		this.id = id; // Using 'this' to refer to the instance variable
		this.name = name; // Using 'this' to refer to the instance variable
		
	}
	void display() {
		System.out.println("ID: " + id + ", Name: " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this_modifier t = new this_modifier(1, "Java"); // Creating an object of the class
		t.display(); // Calling the display method to print the values
	}

}
