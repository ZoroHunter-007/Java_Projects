package Basic;
import java.util.Scanner;
public class linear_search {
	int linearSearch(int arr[], int x) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				return i; // Return the index if found
			}
		}
		return -1; // Return -1 if not found
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		linear_search ls = new linear_search();
		System.out.println("Enter the number of elements in the array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter the element to search:");
		int x = sc.nextInt();
		
		int result = ls.linearSearch(arr, x);
		if(result != -1)
		{
			System.out.println("Element found at index: " + result);
			
		}
		
		
		else
		{
			System.out.println("Element not found in the array.");
		}
	}

}
