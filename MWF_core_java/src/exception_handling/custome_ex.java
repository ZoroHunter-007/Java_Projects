package exception_handling;
import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class custome_ex {
Scanner sc = new Scanner(System.in);
	public custome_ex() throws InvalidAgeException {
		
		System.out.println("Enter Age: ");
		int age= sc.nextInt();
		
		if(age<18) {
			throw new InvalidAgeException("Age must be 18 or above.");
			}
		else {
			System.out.println("Age is valid: " + age);
		}
			
		}
	public static void main(String[] args) throws InvalidAgeException {
		custome_ex obj = new custome_ex();
	}
}

