package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.io.InputStream;

import com.dao.DataDao;

import com.model.User_reg;

/**
 * Servlet implementation class Register_burger
 */
@WebServlet("/Register_burger")
@MultipartConfig(maxFileSize = 16177215)
public class Register_burger extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register_burger() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		  String fullname=request.getParameter("fullname");
		  String email = request.getParameter("email");
		  String username=request.getParameter("reg_username");
	      String password = request.getParameter("reg_password");
	      Part image=request.getPart("image");
	      InputStream file=image.getInputStream();
	      byte b[]=file.readAllBytes();
	       
	      Mailer.send(email, "Welcome to our Food Resturant Website", "Hello "+fullname+",\n\nThank you for registering on our Food Resturant Website. We're excited to have you on board!\n\nBest regards,\nFood Resturant Team");
	      
	      User_reg u=new User_reg();
	     u.setFullname(fullname);
	     u.setEmail(email);
	     u.setUsername(username);
	     u.setPassword(password);
	     u.setImage(b);
	      DataDao d=new DataDao();
	      String s=d.InsertData(u);
	      if ("Insert".equalsIgnoreCase(s)) {
	    	  RequestDispatcher rd=request.getRequestDispatcher("Login_burger.jsp");
	    	  rd.forward(request, response);
	      }
	      else {
	    	  
	    	  RequestDispatcher rd=request.getRequestDispatcher("Error.jsp");
	    	  rd.forward(request, response);
	      }
	       
		doGet(request, response);
	}

}
