package com.emp.dao;
import java.sql.*;import java.util.*;import com.emp.model.Employee;

public class EmployeeDAO {
    private Connection con;
    public EmployeeDAO(Connection con){ this.con = con; }

    public int addEmployee(Employee e) throws Exception {
        PreparedStatement ps = con.prepareStatement("INSERT INTO employee(name,department,salary) VALUES(?,?,?)");
        ps.setString(1,e.getName());
        ps.setString(2,e.getDepartment());
        ps.setDouble(3,e.getSalary());
        return ps.executeUpdate();
    }

    public List<Employee> getAll() throws Exception {
        List<Employee> list = new ArrayList<>();
        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM employee");
        while(rs.next()){
            list.add(new Employee(rs.getInt("id"),rs.getString("name"),rs.getString("department"),rs.getDouble("salary")));
        }
        return list;
    }
}