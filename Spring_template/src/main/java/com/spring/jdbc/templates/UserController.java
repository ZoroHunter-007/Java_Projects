package com.spring.jdbc.templates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller

public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping( value = "/register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mav=new ModelAndView("register");
		mav.addObject("stud",new Student());
		
		return mav;
	}
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public String registerStudent(@ModelAttribute Student stud,HttpSession session) {
		userService.InsertData(stud);
		session.setAttribute("msg", "Student Register Successfully....");
		
		
		return "register";
	}
	
	@RequestMapping(value = "/showdata",method = RequestMethod.GET)
	public ModelAndView showData(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mav=new ModelAndView("showdata");
		mav.addObject("stud",userService.showAllData());
		
		return mav;
		
	}
}
