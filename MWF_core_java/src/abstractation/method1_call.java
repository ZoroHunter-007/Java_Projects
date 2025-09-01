package abstractation;

import java.util.Scanner;


class Bank_of_Baroda extends abstract_method1{

	Scanner sc=new Scanner(System.in);
	@Override
	
	int rate_of_interest() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Rate of Intrest for BOB:");
		int rate=sc.nextInt();
		return rate;
	}
	
}
class State_Bank_India extends abstract_method1{

	Scanner sc=new Scanner(System.in);
	@Override
	
	int rate_of_interest() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Rate of Intrest SBI:");
		int rate=sc.nextInt();
		return rate;
	}
	
}

public class method1_call {

	public static void main(String[] args) {
		System.out.println("Rate of Interest for BOB:"+ new Bank_of_Baroda().rate_of_interest()+"%");
		System.out.println("Rate of Interest for SBI:"+ new State_Bank_India().rate_of_interest()+"%");
	}
	
	
}
