package OOPS_concept;

public class all_identi {

	{
		System.out.println("This is a non-static block");
	}
	static {
		System.out.println("This is a static block");
	}
	public all_identi() {
		System.out.println("This is a constructor");
	}
	public static void m1() {
		System.out.println("This is a static method");
	}
	void m2() {
		System.out.println("This is a non-static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(); // Calling static method without creating an object
		new all_identi().m2(); // Creating an object to access non-static members
	}

}
