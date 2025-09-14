package Ass_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/smilecare";
        String username = "root";
        String password = "password";
        return DriverManager.getConnection(url, username, password);
    }
}