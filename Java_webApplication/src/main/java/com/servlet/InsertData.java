package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.Data_dao;
import com.model.user_reg;

/**
 * Servlet implementation class InsertData
 */
@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Data_dao d=new Data_dao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertData() {
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
			String id=request.getParameter("id");
			
			user_reg u=d.GetId(Integer.parseInt(id));
			request.setAttribute("edit", u);
			request.getRequestDispatcher("edit.jsp").forward(request, response);
		}
		else if("delete".equalsIgnoreCase(action)) {
			String id=request.getParameter("id");
			
			String s=d.DeleteId(Integer.parseInt(id));
			if("Delete".equalsIgnoreCase(s)) {
				RequestDispatcher rd= request.getRequestDispatcher("ShowData");
				rd.forward(request, response);
			}
		}
		// ... Inside your servlet's doPost/doGet method ...

		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id=request.getParameter("id");
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");
		
		
		user_reg ur=new user_reg();
		ur.setUsername(username);
		ur.setPassword(password);
		ur.setEmail(email);
		ur.setPassword(password);
		ur.setPhone(phone);
		
		ur.setId(Integer.parseInt(id));
		
		Data_dao dao=new Data_dao();
		String s=dao.UpdateData(ur);
		if("Update".equalsIgnoreCase(s)) {
			RequestDispatcher rd= request.getRequestDispatcher("ShowData");
			rd.forward(request, response);
		}
		doGet(request, response);
	}

}
