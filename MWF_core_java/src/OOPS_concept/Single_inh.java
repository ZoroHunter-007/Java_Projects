package OOPS_concept;
class Parent_1 {
	Parent_1() {
		System.out.println("This is the parent class constructor");
	}
}
class Child_1 extends Parent_1 {
	Child_1() {
		System.out.println("This is the child class constructor");
	}
}


public class Single_inh {
public static void main(String[] args) {
	System.out.println("This is a single inheritance example.");
	Child_1 child = new Child_1(); // Creating an object of the child class
}
}
