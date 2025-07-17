package Inheritance;
class Admin1{
	void display() {
		System.out.println("Admin1 class display method");
	}
}
class Admin2 extends Admin1{
	
	void display() {
		super.display();
		System.out.println("Admin2 class display method");
	}
}
class Admin3 extends Admin1{
	
	void display() {
			super.display();
		System.out.println("Admin3 class display method");
	}
}
public class herierachy_in {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Admin2().display(); // Creating an object of Admin2 and calling display method
		new Admin3().display(); // Creating an object of Admin3 and calling display method

	}

}
