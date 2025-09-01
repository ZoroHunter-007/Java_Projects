package practice_pakage;

import java.util.Scanner;

class A extends abstract_method_test{

	int a,b,c;
	Scanner sc=new Scanner(System.in);
	@Override
	int add() {
		// TODO Auto-generated method stub
		System.out.println("Enter A:");
		a=sc.nextInt();
		System.out.println("Enter B:");
		b=sc.nextInt();
		c=a+b;
		return c;
	}
	@Override
	int sub() {
		System.out.println("Enter A:");
		a=sc.nextInt();
		System.out.println("Enter B:");
		b=sc.nextInt();
		c=a-b;
		// TODO Auto-generated method stub
		return c;
	}
	@Override
	int mul() {
		System.out.println("Enter A:");
		a=sc.nextInt();
		System.out.println("Enter B:");
		b=sc.nextInt();
		c=a*b;
		// TODO Auto-generated method stub
		return c;
	}
	@Override
	float div() {
		// TODO Auto-generated method stub
		System.out.println("Enter A:");
		a=sc.nextInt();
		System.out.println("Enter B:");
		b=sc.nextInt();
		if(b!=0) {
		c=a/b;
		return c;
		}
		else {
			System.out.println("No division by zero");
		}
		return 0;
	}
	
}
public class call_test {
	public static void main(String[] args) {
		A a=new A();
		System.out.println("Addition is:"+a.add());
		System.out.println("Subtraction is:"+a.sub());
		System.out.println("Multiplication is:"+a.mul());
		System.out.println("Division is:"+a.div());
	}

}
