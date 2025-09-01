package sql_connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update_query {

	public static void main(String[] args) {
		Connection_file c=new Connection_file();
		Connection con=c.gConnection();
		
		try {
			PreparedStatement ps=con.prepareStatement("update student set rno=?,s_name=?,department=? where id=?");
			ps.setInt(1,10);
			ps.setString(2,"Anuj");
			ps.setString(3,"MCA");
			ps.setInt(4, 2);
			ps.executeUpdate();
			System.out.println("Updated Successfully...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
