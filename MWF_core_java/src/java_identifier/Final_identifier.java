package java_identifier;

final class test{
	final int a;
	public test() {
			a=12;
			System.out.println(a);
		}
	final void display() {
		System.out.println("Final Method");
	}

}
public class Final_identifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test();
		t.display();
	}

}
	