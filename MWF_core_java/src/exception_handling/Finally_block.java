package exception_handling;

public class Finally_block {
	public Finally_block() {
		try {
			int i=10/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Final Block");
		}
	}
	
	public static void main(String[] args) {
		new Finally_block();
	}
}

