package Basic;

import java.util.Scanner;

public class bubble_sort_algo {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of an array:");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements of an array:");
		
	
			for(int i=0;i<size;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			for(int i=0;i<size;i++)
			{
				for(int j=i+1;j<size;j++)
				{
					if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println("Sorting the array:");
			for(int i=0;i<size;i++)
			{
				System.out.println(arr[i]);
			}
		System.out.println("Array sorted successfully!");
	}

}
