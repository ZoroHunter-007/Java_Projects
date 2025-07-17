package file_handling;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class file_outputstream {
Scanner sc = new Scanner(System.in);
	public file_outputstream() throws IOException{
		FileOutputStream fos = new FileOutputStream("output.txt");
		String str;
		System.out.println("Enter the string to write in file:");
		str=sc.nextLine();
		byte b[]=str.getBytes(); // Convert string to byte array
		fos.write(b) ; // Write byte array to file
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new file_outputstream();
	}

}
