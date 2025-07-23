package OOPS_concept;

public class call_interface_1 implements interface_1,interface_2,interface_3 {
	public void test() {
		System.out.println("Test method");
	}
	public void test2() {
		System.out.println("Second test method");
	}
	public void test3() {
		System.out.println("Third test method");
	}

	public static void main(String[] args) {
		new call_interface_1().test();
		new call_interface_1().test2();
		new call_interface_1().test3();
	}

}
