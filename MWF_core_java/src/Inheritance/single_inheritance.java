package Inheritance;

class Parent{
	public Parent(int i) {
		System.out.println("Parent constructor="+i);
	}
	public void test(int i) {
		System.out.println("Parent method value="+i);
	}
}
class Child extends Parent{
	public Child(int i) {
		super(10);
		System.out.println("Child constructor="+i);
	}
	public void test(int i) {
		super.test(20);
		System.out.println("Child method value="+i);
	}
}
class GrandChild extends Child{
	public GrandChild(int i) {
		super(30);
		System.out.println("GrandChild constructor="+i);
	}
	public void test(int i) {
		super.test(40);
		System.out.println("GrandChild method value="+i);
	}
}
public class single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GrandChild(50).test(60);
		

	}

}
