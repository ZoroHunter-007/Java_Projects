package Basic;

import java.util.Scanner;

public class sum_array {
public int sum() {
	Scanner sc=new Scanner(System.in);
	int nsum=0;
	System.out.println("Enter the size of an array:");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the elements of an array:");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
		nsum=nsum+arr[i];
		
	}
	System.out.println("The sum of an array is:"+nsum);

	return nsum;
}
	
	public static void main(String[] args) {
		new sum_array().sum();
	}
}
