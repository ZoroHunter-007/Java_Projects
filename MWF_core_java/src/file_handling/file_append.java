package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_append {

	public file_append() throws IOException {
		FileInputStream fin=new FileInputStream("test1.txt"); // Open file input stream
		FileOutputStream fos=new FileOutputStream("test1.txt", true); // Open file output stream in append mode
		String s=" Hello";
		byte b[]=s.getBytes(); // Convert string to byte array
		fos.write(b); // Write byte array to file
		int count=0;
		int i;
		while((i=fin.read())!=-1) { // Read until end of file
			System.out.print((char)i); // Print character
			count++; // Increment character count
		}
		System.out.println("\nTotal characters in file: " + count); // Print total character count
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new file_append();
	}

}
