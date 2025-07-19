package exception_handling;
public class array_exception {

	int arr[] = new int[5];
	public array_exception() {
		arr[4]=10;
		try {
			System.out.println("Accessing element at index 4: " + arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array_exception obj = new array_exception();
	}

}
