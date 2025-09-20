package Basic_programs;

import java.util.Scanner;

public class food_application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Hello "+name+" ,Thanks for choosing our Food...");
		int choice=0;
		String item=null;
		double price=0.0;
		int qty=0;
		do {
			
			System.out.println("1.Starter");
			System.out.println("2.Main Course");
			System.out.println("3.Desert");
			System.out.println("4.Beverage");
			System.out.println("5.Exit");
			int ch=sc.nextInt();
			
			switch(ch) {
			
			case 1:
				System.out.println("1.Chinese Noodles");
				System.out.println("2.Panner Chilly");
				System.out.println("3.Manchurian Dry");
				System.out.println("4.Veg. Stick");
				int StarterChoice=sc.nextInt();
			
				System.out.println("Enter the Quntity:");
				qty=sc.nextInt();
				switch(StarterChoice) {
				case 1:
					item="Chinese Noodles";
					price=150.15;
					break;
					
				case 2:
					item="Panner Chilly";
					price=250.89;
					break;
					
				case 3:
					item="Manchurian Dry";
					price=200.45;
					break;
					
				case 4:
					item="Veg. Stick";
					price=190.59;
					break;
					
				default:
					System.out.println("You select Invalid Starter...!");
					break;
					
				}
				
				break;
				
			case 2:
				System.out.println("1.Punjabi Main course");
				System.out.println("2.Gujarti Main Course");
				System.out.println("3.Maharashtrian Main course");
				System.out.println("4.Rajsathani Main course");
				int MainCourseChoice=sc.nextInt();
				
				System.out.println("Enter the Quntity:");
				qty=sc.nextInt();
				
				switch(MainCourseChoice) {
				
				case 1:
					item="Punjabi Main course";
					price=500.14;
					break;
					
				case 2:
					item="Gujarti Main Course";
					price=350.45;
					break;
					
				case 3:
					item="Maharashtrian Main course";
					price=450.89;
					break;
					
				case 4:
					item="Rajsathani Main course";
					price=300.97;
					break;
					
				default:
					System.out.println("You select Invalid Main Course...!");
					break;
				}
				break;
				
			case 3:
				System.out.println("1.Ice-Cream");
				System.out.println("2.Chocalate Brownee");
				System.out.println("3.Gulaab Jamun(6 pics)");
				System.out.println("4.Spcial Shake");
				int DesertChoice=sc.nextInt();
			
				System.out.println("Enter the Quntity:");
				qty=sc.nextInt();
				
				switch(DesertChoice) {
				
				case 1:
					item="Ice-Cream";
					price=100.49;
					break;
					
				case 2:
					item="Chocalate Brownee";
					price=155.94;
					break;
					
				case 3:
					item="Gulaab Jamun";
					price=200.25;
					break;
					
				case 4:
					item="Spcial Shake";
					price=250.99;
					break;
					
					
				default:
					System.out.println("You select Invalid Desert...!");
					break;
				}
				break;
				
			case 4:
				System.out.println("1.Soft Drinks");
				System.out.println("2.Minral Water");
				System.out.println("3.Chhass");
				System.out.println("4.Tea");
				System.out.println("5.Coffee");
				int BeverageChoice=sc.nextInt();
			
				System.out.println("Enter the Quntity:");
				qty=sc.nextInt();
				
				switch(BeverageChoice) {
				
				case 1:
					item="Soft Drinks";
					price=40.49;
					break;
					
				case 2:
					item="Minral Water";
					price=20.94;
					break;
					
				case 3:
					item="Chhass";
					price=15.20;
					break;
					
				case 4:
					item="Tea";
					price=30.99;
					break;
				
				case 5:
					item="Coffee";
					price=50.78;
					break;
					
				default:
					System.out.println("You select Invalid Desert...!");
					break;
				}
				break;
				
			case 5:
				System.exit(0);
				break;
				
			}
			System.out.println("--------Your Order Summary--------");
			System.out.println("Orderer Name:"+name);
			System.out.println("Item:"+item);
			System.out.println("Item Quntitty:"+qty);
			System.out.println("Total Bill:"+(price*qty));
			System.out.println("Enjoy your meal and please visit again...");
			System.out.println("Do you want to continue(press 1 for yes/ press 0 for no):");
			choice=sc.nextInt();
		}while(choice==1);
		
	}

}
