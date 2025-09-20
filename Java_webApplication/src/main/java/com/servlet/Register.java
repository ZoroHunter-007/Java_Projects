package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Connection.Dbconn;

/**
 * Servlet implementation class InsertPage
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		Dbconn db=new Dbconn();
		
		Connection con=db.getConnection();
		 if (con == null) {
	            response.getWriter().println("Database connection failed!");
	            return;
	        }
	   try {
		PreparedStatement ps=con.prepareStatement("SELECT * FROM bank_login WHERE email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			response.sendRedirect("BusTraveler.jsp");
		}
		else {
			response.sendRedirect("error.jsp");
		}
		con.close();	
	} 
	   
	   catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		doGet(request, response);
	}

}
