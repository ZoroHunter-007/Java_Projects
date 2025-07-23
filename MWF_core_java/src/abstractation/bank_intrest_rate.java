package abstractation;
class axis extends getrate{
	int r=7;
	int rate() {
		return r;
		
	}
}
class bob extends getrate{
	int r=8;
	int rate() {
		return r;
		
	}
}
class sbi extends getrate{
	int r=9;
	int rate() {
		return r;
	}
}

public class bank_intrest_rate {
public static void main(String args[]) {
	new axis().rate(); 
	System.out.println("Axis Bank Interest Rate: " + new axis().rate() + "%");
	
	new bob().rate();
	System.out.println("Bank of Baroda Interest Rate: " + new bob().rate() + "%");
	
	new sbi().rate(); 
	System.out.println("State Bank of India Interest Rate: " + new sbi().rate() + "%");
  }


}
