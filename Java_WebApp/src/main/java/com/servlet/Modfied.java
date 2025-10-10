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
import java.util.List;

import com.dao.DataDao;
import com.model.User_reg;

/**
 * Servlet implementation class Modfied
 */
@WebServlet("/Modfied")
@MultipartConfig	
public class Modfied extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Modfied() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		if("edit".equalsIgnoreCase(action)) {
			DataDao dao=new DataDao();
			String id=request.getParameter("id");
			User_reg u=dao.GetId(Integer.parseInt(id));
			request.setAttribute("edit", u);
			RequestDispatcher rd=request.getRequestDispatcher("edit.jsp");
			rd.forward(request, response);
		}
		else if("delete".equalsIgnoreCase(action)) {
			DataDao dao=new DataDao();
			String id=request.getParameter("id");
			String s=dao.DeleteId(Integer.parseInt(id));
			if("Delete".equalsIgnoreCase(s)) {
				
				RequestDispatcher rd=request.getRequestDispatcher("ShowData");
				rd.forward(request, response);
				
			}
			
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fullname=request.getParameter("fullname");
		String email=request.getParameter("email");
		String username=request.getParameter("reg_username");
		String password=request.getParameter("reg_password");
		String id=request.getParameter("id");
		Part image = request.getPart("Userimage");
		
			InputStream is=image.getInputStream();
			byte[]	b=is.readAllBytes();
		
		
		
		User_reg ur=new User_reg();
		ur.setFullname(fullname);
		ur.setEmail(email);
		ur.setUsername(username);
		ur.setPassword(password);
		ur.setImage(b);
		ur.setId(Integer.parseInt(id));
	
	

		DataDao d = new DataDao();
		String s = d.UpdateId(ur);

		if ("Update".equalsIgnoreCase(s)) {
		   
		    RequestDispatcher rd = request.getRequestDispatcher("ShowData");
		    rd.forward(request, response);
		} 
		// ... [rest of the servlet code] ...
		doGet(request, response);
	}

}
