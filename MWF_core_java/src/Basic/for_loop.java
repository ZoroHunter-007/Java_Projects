package Basic;
import java.util.Scanner;
public class for_loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num= sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of " + num + " is: " + fact);
		
		System.out.println("Enter the number:");
		int n= sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
				System.out.println(i +" is a factor of " + n);
			}
			
		}
		if(count>2)
		{
			System.out.println(n + " is not a prime number.");
		}
		else
		{
			System.out.println(n + " is a prime number.");
		}
		
		int a=0,b=1;
		while(b<=n) {
			System.out.println(a + " ");
			int c=a+b;
			a=b;
			b=c;
			
			}
		
		System.out.println("Enter the number:");
		int n1=sc.nextInt();
		int sum=0;
		int temp=n1;
		while(n1>0)
		{
			int digit=n1%10;
			sum+=digit*digit*digit;
			n1=n1/10;
			
		}
		if(temp==sum)
		{
			System.out.println(temp + " is an Armstrong number.");
		}
		else
		{
			System.out.println(temp + " is not an Armstrong number.");
		}
		
		System.out.println("Enter the number:");
		int rnum=sc.nextInt();
		int rev=0;
		while(rnum>0)
		{
			int digit=rnum%10;
			rev=rev*10+digit;
			rnum=rnum/10;
		}
		System.out.println("Reversed number is: " + rev);
	}
}