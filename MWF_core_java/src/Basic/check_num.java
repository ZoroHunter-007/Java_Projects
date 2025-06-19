package Basic;
import java.util.Scanner;
public class check_num {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a name:");
		String name = sc.nextLine();
		System.out.println("Enter the total number of subjects:");
		int n = sc.nextInt();
		int[] marks=new int[n];
		int tot=0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter marks for subject " + (i+1) + ":");
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			tot+=marks[i];
		}
		System.out.println("Total marks: " +tot);
		float per=tot/n;
		System.out.println("Percentage: " + per + "%");
		
		
	}

}
