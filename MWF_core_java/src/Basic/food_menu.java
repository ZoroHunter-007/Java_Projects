package Basic;
import java.util.Scanner;
public class food_menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Food Menu!");
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Hello " +name + "! Please select a category:");
		int choice;
		String item = null;
		int price=0;
		int quantity = 0;
		
		do {
			System.out.println("1. Starters");
			System.out.println("2. Main Course");
			System.out.println("3. Desserts");
			System.out.println("4. Beverages");
			System.out.println("5. Exit");
			System.out.print("Enter your choice (1-5): ");
			int ch= sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Select a starter:");
				System.out.println("1. Spring Rolls Rs. 100");
				System.out.println("2. Garlic Bread Rs. 80");
				System.out.println("3. Chicken Wings Rs. 150");
				System.out.print("Enter your choice (1-3): ");
				int starterChoice = sc.nextInt();
				System.out.println("Enter the quntity:");
				 quantity = sc.nextInt();
				switch(starterChoice) {
					case 1:
						item= "Spring Rolls";
						price = 100;
						break;
					case 2:
						item= "Garlic Bread";
						price = 80;
						break;
					case 3:
						item= "Chicken Wings";
						price = 150;
						break;
					default:
						System.out.println("Invalid choice for starters.");
						break;
				}
				break;
				case 2:
					System.out.println("Select a main course:");
					System.out.println("1. Pasta Rs. 200");
					System.out.println("2. Pizza Rs. 250");
					System.out.println("3. Biryani Rs. 300");
					System.out.print("Enter your choice (1-3): ");
					int mainCourseChoice = sc.nextInt();
					System.out.println("Enter the quntity:");
					 quantity = sc.nextInt();
					 switch(mainCourseChoice) {
					 
					 case 1:
						 item= "Pasta";
						 price = 200;
						 break;
					 case 2:
						 item= "Pizza";
						 price = 250;
						 break;
					 case 3:
						 item= "Biryani";
						 price = 300;
						 break;
					
					default:
							System.out.println("Invalid choice for main course.");
							break;
					 }
					 break;
					 case 3:
						 System.out.println("Select a dessert:");
						 System.out.println("1. Ice Cream Rs. 50");
						 System.out.println("2. Cake Rs. 150");
						 System.out.println("3. Brownie Rs. 100");
						 System.out.print("Enter your choice (1-3): ");
						 int dessertChoice = sc.nextInt();
						 System.out.println("Enter the quntity:");
						  quantity = sc.nextInt();
						  switch(dessertChoice) {
						  case 1:
							  item= "Ice Cream";
							  price = 50;
							  break;
						  case 2:
							  item= "Cake";
							  price = 150;
							  break;
						  case 3:
							  item= "Brownie";
							  price = 100;
							  break;
						  default:
							  System.out.println("Invalid choice for desserts.");
							  break;
						  }
						  break;
						  case 4:
							  System.out.println("Select a beverage:");
							  System.out.println("1. Coffee Rs. 30");
							  System.out.println("2. Tea Rs. 20");
							  System.out.println("3. Soft Drink Rs. 40");
							  System.out.print("Enter your choice (1-3): ");
							  int beverageChoice = sc.nextInt();
							  	
							  System.out.println("Enter the quntity:");
							   quantity = sc.nextInt();
							   switch(beverageChoice) {
							   case 1:
								   item= "Coffee";
								   price = 30;
								   break;
							   case 2:
								   item= "Tea";
								   price = 20;
								   break;
							   case 3:
								   item= "Soft Drink";
								   price = 40;
								   break;
							   default:
								   System.out.println("Invalid choice for beverages.");
								   break;
							   }
							   break;
							   case 5:
								   System.out.println("Thank you for visiting the Food Menu!");
								   return;
							 default:
								   System.out.println("Invalid choice. Please try again.");
								   break;
			
			}
			
			System.out.println("Your order summary:");
			System.out.println("Item: " + item);
			System.out.println("Quantity: " + quantity);
			System.out.println("Total Price: Rs. " + (price * quantity));
			System.out.println("Thank you for visiting the Food Menu, " + name + "!");
			System.out.println("Do you want to continue? (1 for Yes, 0 for No)");
			choice = sc.nextInt();
			
		}while(choice==1);
		
		
	}

}
