package Basic;
import java.util.Scanner;
public class nested_switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
		System.out.println("Enter branch name:");
		String branch=sc.next();
		System.out.println("Enter semester:");
		int sem=sc.nextInt();
		
		switch(branch)
		{
		case "CSE":
			switch(sem)
			{
			case 1:
				System.out.println("CSE 1st semester subject:Mathemetics,Physics,Chemestry");
				break;
				
			case 2:
				System.out.println("CSE 2nd semester subject:DSA,CO,Discete Mathemetics");
				break;
				
			case 3:
				System.out.println("CSE 3rd semester subject:OS,DBMS,SE");
				break;
				
			default:
				System.out.println("Invalid semester for CSE");
				break;
			}
			break;
		case "IT":
			switch(sem)
			{
			case 1:
				System.out.println(""+"IT 1st semester subject:Mathemetics,Physics,Chemestry");
				break;
				
			case 2:
				System.out.println("IT 2nd semester subject:DSA,CO,Discete Mathemetics");
				break;
				
			case 3:
				System.out.println("IT 3rd semester subject:OS,DBMS,SE");
				break;
				
			default:
				System.out.println("Invalid semester for IT");
				break;
			}
			break;
			default:
				System.out.println("Invalid branch name");
				break;
				
			
			
		}
			System.out.println("Do you want to continue...");
			choice=sc.nextInt();
		
	
		}while(choice==1);
		
	}

}
