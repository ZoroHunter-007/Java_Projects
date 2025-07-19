package Basic;
import java.util.Scanner;
public class two_dimensional_array {
Scanner sc = new Scanner(System.in);
	int rows, columns;
	int arr[][];
	
	public two_dimensional_array() {
		System.out.println("Enter the number of rows:");
		rows = sc.nextInt();
		System.out.println("Enter the number of columns:");
		columns = sc.nextInt();
		arr=new int[rows][columns];
		System.out.println("Enter the elements of an array:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
	}
	void display() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(arr[i][j] + " ");
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new two_dimensional_array().display();
	}

}
