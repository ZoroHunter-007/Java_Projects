package practice_pakage;

public class Employee_encap {

	private int emp_id;
	private String e_name;
	private String e_department;
	private double sal;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_department() {
		return e_department;
	}
	public void setE_department(String e_department) {
		this.e_department = e_department;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public void sal_verify(double sal) {
		if(sal<0) {
			System.out.println("Your Salary is not Valid");
		}
		else if(sal>0 && sal<30000) {
			System.out.println("Your Salary is Low");
		}
		else if(sal>=30000 && sal<60000) {
			System.out.println("Your Salary is Average");
		}
		else if(sal>=60000 && sal<100000) {
			System.out.println("Your Salary is Good");
		}
		else {
			System.out.println("Your Salary is High");
		}
	}
}
