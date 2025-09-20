package Basic_programs;

import java.util.Scanner;

public class Sum_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int sum=0;
		
		//enter the elements
		System.out.println("Enter the Elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
			
		}
		
		//printing the elements and sum of elements
		System.out.println("Sum of Elemets:");
		for(int i=0;i<size;i++) {
			System.out.println("Elements "+(i+1)+":"+arr[i]);
		}
		System.out.println("Sum of Array elements:"+sum);
	}

}
