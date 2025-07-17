package file_handling;
import java.io.FileInputStream;
import java.io.IOException;
public class file_inputstream {

	public file_inputstream()throws IOException{
		FileInputStream fin=new FileInputStream("output.txt"); // Open file input stream
		int i;
		System.out.println("Contents of the file:");
		while((i=fin.read())!=-1) { // Read until end of file
			System.out.print((char)i); // Print character
		}
		
	}
	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		new file_inputstream();

	}

}
