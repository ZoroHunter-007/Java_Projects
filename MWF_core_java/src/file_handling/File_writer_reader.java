package file_handling;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class File_writer_reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw=new FileWriter("test1.txt"); // Create a FileWriter in append mode
		String s="Hello";
		fw.write(s); // Write the string to the file
		fw.close(); // Close the FileWriter
		
		FileReader fr=new FileReader("test1.txt"); // Create a FileReader to read the file
		char c[]=new char[100]; // Create a character array to hold the read characters
		fr.read(c); // Read characters from the file into the array
		System.out.println(c);
		fr.close(); // Close the FileReader
	}

}
