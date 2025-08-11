package Data_Structure;

import java.util.ArrayList;
import java.util.Scanner;

public class inventory_arraylist {

	int pid;
	String pname;
	int qty;
	double price;
	public  inventory_arraylist(int pid,String pname,int qty,double price) {
		this.pid=pid;
		this.pname=pname;
		this.qty=qty;
		this.price=price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<inventory_arraylist>al=new ArrayList<inventory_arraylist>();
		Scanner sc=new Scanner(System.in);
		
		int ch=0;
		do {
			System.out.println("1. Add new Product in inventory");
			System.out.println("2. Display all Products in inventory");
			System.out.println("3. Search Product inventory by Name");
			System.out.println("4. Update Quntity");
			System.out.println("5. Calculate Total Price");
			System.out.println("6. Delete Product by ID");
			System.out.println("7. Exit");
			System.out.println("Enter your choice(1-7):");
			int c=sc.nextInt();
			
			switch(c)
			{
			case 1:
				System.out.println("Enter the size of the inventory: ");
				int n=sc.nextInt();
				for(int i=0;i<n;i++) {
					System.out.println("Enter Product ID" + (i+1) + ":" );
					int pid=sc.nextInt();
					System.out.println("Enter Product Name" +(i+1) + ":");
					String pname=sc.next();
					System.out.println("Enter Product Quantity" + (i+1) + ":");
					int qty=sc.nextInt();
					System.out.println("Enter Product Price" + (i+1) + ":");
					double price=sc.nextDouble();
					al.add(new inventory_arraylist(pid,pname,qty,price));
					System.out.println("Product " + (i+1) + " added successfully!");
				}
				break;
			case 2:
				System.out.println("Product Details:");
				for(inventory_arraylist ia:al) {
					System.out.println("Product ID: " + ia.pid + ", Product Name: " + ia.pname + 
							", Quantity: " + ia.qty + ", Price: " + ia.price);
				}
				break;
				
			case 3:
				System.out.println("Enter Product Name to search:");
				String sname=sc.next();
				//boolean fo=false;
				for(inventory_arraylist ia:al)
				{
					if(ia.pname.equalsIgnoreCase(sname)) {
						System.out.println("Product ID: " + ia.pid + ", Product Name: " + ia.pname + 
								", Quantity: " + ia.qty + ", Price: " + ia.price);
						//fo=true;
						break;
					}
				}
				
				break;
				
			case 4:
				System.out.println("Enter Product ID to update quantity:");
				int upid=sc.nextInt();
				boolean f=false;
				for(inventory_arraylist ia:al) {
					if(upid==ia.pid) {
						System.out.println("Enter new quantity for Product ID " + upid + ":");
						int newQty=sc.nextInt();
						ia.qty=newQty;
						f=true;
						break;
					}
				}
				if(!f) {
					System.out.println("" + upid + " Product ID not found!");
					break;
				}
				break;
				
			case 5:
				double tot=0.0;
				for(inventory_arraylist ia:al) {
					tot+=ia.price*ia.qty;
				}
				System.out.println("Total Inventory value: " + tot);
				break;
				
			case 6:
				System.out.println("Enter ID do you want to Delete:");
				int did=sc.nextInt();
				boolean found=false;
				for(inventory_arraylist ia:al) {
					if(did==ia.pid) {
						al.remove(ia);
						System.out.println("Product with ID " + did + " has been deleted.");
						found=true;
						break;
					}
				}
				if(!found) {
					System.out.println("Product with ID " + did + " not found.");
				}
				break;
				
			case 7:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid choice! Please enter a number between 1 and 7.");
				break;
			}
			System.out.println("Do you want to continue? (1 for Yes, 0 for No):");
			ch=sc.nextInt();
			
		}while(ch==1);
		
	}

}
