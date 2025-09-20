package Basic_programs;

import java.util.Scanner;

public class Linear_search {

	public int linear_search(int arr[],int x) {
		
		int n=arr.length;
	
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x) {
				return i;
			}
		}
		return-1;
		
	}
	
	public static void main(String[] args) {
		Linear_search l=new Linear_search();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		//enter the elements
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Element you want to Search:");
		int x=sc.nextInt();
		int i=l.linear_search(arr, x);
		if(i!=-1) {
			System.out.println("Element found at index:"+i);
		}
		else {
			System.out.println("Element not found...!");
		}
	}
}
