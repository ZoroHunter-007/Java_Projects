package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_read_write {

	public file_read_write() throws IOException {
		// Constructor to initialize file reading/writing
		FileInputStream fin=new FileInputStream("output.txt"); // Open file input stream
		FileOutputStream fos = new FileOutputStream("test.txt", true);
 		int i;
 		System.out.println("Contents of the file:");
		while((i=fin.read())!=-1) { // Read until end of file
			System.out.print((char)i); // Print character
			fos.write(i); // Write character to output file
		}
		
		 // Open file output stream in append mode
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new file_read_write();
	}

}
