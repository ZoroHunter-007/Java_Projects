package com.emp.service;
import java.util.*;import com.emp.dao.EmployeeDAO;import com.emp.model.Employee;

public class EmployeeService {
    private EmployeeDAO dao;
    public EmployeeService(EmployeeDAO dao){ this.dao = dao; }
    public int addEmployee(Employee e)throws Exception{ return dao.addEmployee(e); }
    public List<Employee> listEmployees()throws Exception{ return dao.getAll(); }
}