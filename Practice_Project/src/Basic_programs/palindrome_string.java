package Basic_programs;

import java.util.Scanner;

public class palindrome_string {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String:");
		String str=sc.next();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev+=str.charAt(i);
		}
		if(rev.equalsIgnoreCase(str)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
	}
}
