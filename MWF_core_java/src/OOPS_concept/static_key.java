package OOPS_concept;
//we can access static members without creating an object of the class
// static var, static method, static block,static nested class
public class static_key {
	
	static int a = 10; // static variable
	
	static void m1()
	{
		
		System.out.println("This is a static method");
	}
	void m2()
	{
		System.out.println("This is a non-static method");
	}
	static {
		System.out.println("This is a static block");
	}
	{
		
	
		System.out.println("This is a non-static block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static_key.m1(); // Calling static method without creating an object
		static_key obj = new static_key(); // Creating an object to access non-static members
		obj.m2(); // Calling non-static method using the object
		System.out.println(a);
	}

}
