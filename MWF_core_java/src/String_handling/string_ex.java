package String_handling;

import java.util.Scanner;

public class string_ex {

	public string_ex() {
		String str="hello";
		String str1="world";
		System.out.println(str.equals(str1)); // Compare two strings for equality
		
		System.out.println(str.equalsIgnoreCase(str1)); // Compare two strings ignoring case
		
		System.out.println(str.length());// Get length of string
		
		System.out.println(str.charAt(1));// Get character at index 1
		
		System.out.println(str.indexOf('h'));// Get index of character 'h'
		
		System.out.println(str.toUpperCase()); // Convert string to uppercase
		
		System.out.println(str.toLowerCase()); // Convert string to lowercase
		
		System.out.println(str.concat(str1)); // Concatenate two strings
		
		System.out.println(str.replace('h', 'H')); // Replace character in string
		
		System.out.println(str.substring(1, 4)); // Get substring from index 1 to 3
		
		System.out.println(str.contains("lo")); // Check if string contains substring
		
		char arr[]=str.toCharArray(); // Convert string to character array
		for(char c:arr) {
			System.out.println(c + " "); // Print each character in the array
		}
		System.out.println(str.valueOf(10));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine(); // Read a line of input from user
		int atindexOf=input.indexOf('@'); // Find index of '@' character
		System.out.println(input.substring(0, atindexOf)); // Print substring before '@'
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new string_ex(); // Create an instance of string_ex to execute the constructor

	}

}
//What is String pool?
// The String pool is a special memory area in Java where String literals are stored.
// When a String is created using a string literal, it is stored in the String pool.