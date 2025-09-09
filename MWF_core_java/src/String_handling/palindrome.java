package String_handling;

import java.util.Scanner;

public class palindrome {

	public palindrome() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("is palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
		
		
	}
	public static void main(String[] args) {
		new palindrome();
	}
	
}
