package Enacapsulation;

public class employee_encap {

	private String name;
	private int id;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void salary_validation() {
		if(salary>=10000)
		{
			System.out.println("Name :" + this.name + " ID: " + this.id + " Salary: " + this.salary);
		}
		else {
			System.out.println("Salary must be 10000 ");
		}
	}
}
