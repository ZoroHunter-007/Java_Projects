package sql_connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert_query {

	public static void main(String[] args) {
		Connection con;
		Connection_file c=new Connection_file();
		con=c.gConnection();
		if(con!=null) {
			System.out.println("Connection Esstablished");
			
		}
		else {
			System.out.println("Connection Failed");
		}
		//execute the query
		try {
			PreparedStatement ps=con.prepareStatement("insert into student(rno,s_name,department) values(?,?,?)");
			ps.setInt(1, 45);
			ps.setString(2, "Dhruv Malusare");
			ps.setString(3, "Bca");
			ps.executeUpdate();
			System.out.println("Data Inserted Successfully");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
