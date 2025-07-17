package java_identifier;
public class method_chain {

	
	void test() {
		System.out.println("Default method");
	}
	void test(int id) {
		this.test();
		System.out.println(id);
	}
	void test(int id,String name) {
		this.test(10);
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new method_chain().test(100, "Java"); // Calling the method with two parameters

	}

}
