package Inheritance;
import java.util.Scanner;

class EmployeeName{
	static Scanner sc = new Scanner(System.in);
	int size;
	String name[];
	public EmployeeName() {
		System.out.println("Enter the number of employees:");
		size=sc.nextInt();
		name=new String[size];
		System.out.println("Enter the names of employees:");
		for(int i=0;i<size;i++) {
			name[i]=sc.next();
		}
	}
	void display() {
		for(int i=0;i<size;i++) {
			 System.out.println("Employee Name: " + name[i]);
		}
	}
}
class EmployeeSalary extends EmployeeName{
	int salary[];
	String position[];
	public EmployeeSalary() {
		salary=new int[size];
		position=new String[size];
		System.out.println("Enter the position of each employee(fresher/manager/expirenced/other) :");
		for(int i=0;i<size;i++) {
			position[i]=sc.next();
			
			if(position[i].equalsIgnoreCase("fresher")) {
				salary[i]=20000;
			}
			else if(position[i].equalsIgnoreCase("manager")) {
				salary[i]=50000;
			}
			else if(position[i].equalsIgnoreCase("expirenced")) {
				salary[i]=40000;
			}
			else
			{
				salary[i]=30000; // Default salary for other positions
			}
		}
	}
	void display() {
		super.display(); // Calling the display method of EmployeeName class
		for(int i=0;i<size;i++) {
			System.out.println("Name :"+ name[i] + "\tPosition: " + position[i] + "\tSalary: " + salary[i]);
		}
	}
}
public class employee_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSalary empSal = new EmployeeSalary();
		empSal.display(); // Displaying employee names and positions
	}

}
