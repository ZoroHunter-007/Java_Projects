package com.spring.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping(value = "/register")
	public ModelAndView showRegister(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mav=new ModelAndView("register");
		mav.addObject("user",new User());
		
		
		return mav;
	}
	@PostMapping(value = "/register")
	public String registerUser(@ModelAttribute  User user, HttpSession session) {
		userService.register(user);
		session.setAttribute("message","User Register Successfully...");
		return "register";
	}
	
	@GetMapping(value = "/showdata")
	public ModelAndView showData(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mav=new ModelAndView("showUser");
		mav.addObject("users",userService.getallUser());
		return mav;
	}
	
	@GetMapping(value = "/edit")
	public ModelAndView editUser(HttpServletRequest request,HttpServletResponse response,@RequestParam ("id") int id) {
		ModelAndView mav=new ModelAndView("edituser");
		mav.addObject("editdata",userService.getUserById(id));
		
		
		return mav;
	}
	
	@PostMapping(value = "/edituser")
	public String updateUser(@ModelAttribute User user,HttpSession session) {
		userService.UpdateUser(user);
		session.setAttribute("update", "User Data Updated Successfully...");
		 return "redirect:/showdata";
	}
	
}
