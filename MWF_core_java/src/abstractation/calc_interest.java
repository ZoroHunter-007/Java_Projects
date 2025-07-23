package abstractation;

class uco extends roi_method{
	int roi() {
		int r=8;
		int p=36000;
		
		return p*r/100;
	}
}

class idfc extends roi_method{
	int roi() {
		int r=8;
		int p=16000;
		
		return p*r/100;
	}
}

class hdfc extends roi_method{
	int roi() {
		int r=8;
		int p=26000;
		
		return p*r/100;
	}
}
public class calc_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("uco interest: " + new uco().roi());
		System.out.println("idfc interest: " + new idfc().roi());
		System.out.println("hdfc interest: " + new hdfc().roi());
		

	}

}
