package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.dao.Data_dao;
import com.model.Account;

/**
 * Servlet implementation class ShowTransaction
 */
@WebServlet("/ShowTransaction")
public class ShowTransaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	Data_dao dao=new Data_dao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowTransaction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Account>al=(ArrayList<Account>) dao.ShowTransaction();
		request.setAttribute("List", al);
		request.getRequestDispatcher("Transaction.jsp").forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
