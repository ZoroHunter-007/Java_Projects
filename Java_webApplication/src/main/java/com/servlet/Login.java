package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Connection.Dbconn;
import com.dao.Data_dao;
import com.model.user_reg;

/**
 * Servlet implementation class InsertPage
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
	
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		//System.out.println(username+" "+pno+" "+email+" "+password);
		
		user_reg ur=new user_reg();
		ur.setEmail(email);
		ur.setPassword(password);
		Data_dao d=new Data_dao();
		String s=d.VerifyLogin(ur);
		if("Success".equalsIgnoreCase(s)) {
			RequestDispatcher rd=request.getRequestDispatcher("Bank_web.jsp");
			rd.forward(request, response);
		}
		
		
		
		
		doGet(request, response);
	}

}
