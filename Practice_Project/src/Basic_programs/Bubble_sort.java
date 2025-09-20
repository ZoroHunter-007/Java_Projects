package Basic_programs;

import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		//Enter the Value in Array
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		//Sorting the element using bubble sort
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//printing array elements
		System.out.println("After Sorting:");
		for(int i=0;i<size;i++) {
			System.out.println("Elements "+(i+1)+":"+arr[i]);
		}
	}

}
