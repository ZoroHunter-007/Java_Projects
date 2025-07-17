package OOPS_concept;

class Outer{
	void m1() {
		System.out.println("This is a non-static method of Outer class");
	}
	
	static class Inner{
		
			static void m3() {
			System.out.println("This is a static method of Inner class");
		}
	}
}
public class static_nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		o.m1(); // Calling non-static method of Outer class
		Outer.Inner i=new Outer.Inner();
		i.m3(); // Calling static method of Inner class

	}

}
