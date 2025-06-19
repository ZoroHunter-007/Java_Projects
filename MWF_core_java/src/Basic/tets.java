package Basic;
import java.util.Scanner;
public class tets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.next();
		System.out.println("Enter a Integer:");
		int i=sc.nextInt();
		
		System.out.println("You entered string:"+ str);
		System.out.println("You entered integer:"+ i);
		
		if(i%2==0)
		{
			System.out.println(i +" Number is even");
		}
		else
		{
			System.out.println(i +" Number is odd");
		}
		
		System.out.println("Enter the value of A:");
		int a=sc.nextInt();
		System.out.println("Enter the value of B:");
		int b=sc.nextInt();
		
		int choice;
		do {
		System.out.println("Enter your choice:");
		int ch=sc.nextInt();
		
		
		switch(ch)
		{
		case 1:
			int res=a+b;
			System.out.println("Addition: " +res);
			break;
			
		case 2:
			int sub=a-b;
			System.out.println("Subtraction: " +sub);
			break;
			
		case 3:
			int mul=a*b;
			System.out.println("Multiplication: " +mul);
			break;
			
		case 4:
			float div=a/b;
			System.out.println("Division: " +div);
			break;
			
		case 5:
			int mod=a%b;
			System.out.println("Modulo: " +mod);
			break;
			
		default:
			System.out.println("You entered wrong choice...!");
			break;
		}
			System.out.println("Do you want to continue...");
			choice=sc.nextInt();
		}while(choice==1);
		
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int fact=1;
		
		if(num>0)
		{
			for(int j=1;j<=num;j++){
				fact=fact*j;
			}
		}
		System.out.println(num +" of factorial is " +fact);
		
		
		
		
	}

}
