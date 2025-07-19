package file_handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class sequenceInput_stream {

	public sequenceInput_stream() throws IOException {
		// Constructor to initialize sequence input stream
		// This class can be used to read from multiple input streams sequentially
		// Implementation can be added as needed
		FileInputStream fin=new FileInputStream("output.txt"); // Open file input stream
		FileInputStream fin1=new FileInputStream("test.txt"); // Open another file input stream
		
		SequenceInputStream sis = new SequenceInputStream(fin, fin1); // Create sequence input stream from two file input streams
		int i;
		while((i=sis.read())!=-1) { // Read until end of stream
			System.out.print((char)i); // Print character read from sequence input stream
		}
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new sequenceInput_stream(); // Create an instance of sequenceInput_stream to execute the constructor
	}

}
