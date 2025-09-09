package practice_pakage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class driver_class {

	Connection con ;
	public Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stud","root","");
			System.out.println("Driver loaded and Connection Established");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
}
