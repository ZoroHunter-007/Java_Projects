package abstractation;

abstract class Test{
	abstract void demo();
}
public class abstract_class extends Test {
	void demo() {
		System.out.println("This is an abstract class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new abstract_class().demo(); // Create an instance of the abstract class and call the demo method

	}

}
