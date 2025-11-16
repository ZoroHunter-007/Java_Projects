package com.emp.controller;

import jakarta.servlet.http.HttpServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import com.emp.service.EmployeeService;
import com.emp.model.Employee;

public class EmployeeController {

    private EmployeeService service;

    public EmployeeController(EmployeeService service){
        this.service = service;
    }

    @RequestMapping("/")
    public ModelAndView home(){
        return new ModelAndView("index");
    }

    @RequestMapping("/add")
    public ModelAndView add(){
        return new ModelAndView("addEmployee");
    }

    @RequestMapping("/save")
    public ModelAndView save(HttpServletRequest req) throws Exception {
        Employee e = new Employee(
            0,
            req.getParameter("name"),
            req.getParameter("department"),
            Double.parseDouble(req.getParameter("salary"))
        );
        service.addEmployee(e);
        return new ModelAndView("success","message","Employee Added Successfully!");
    }

    @RequestMapping("/list")
    public ModelAndView list() throws Exception {
        return new ModelAndView("listEmployees","list",service.listEmployees());
    }

}