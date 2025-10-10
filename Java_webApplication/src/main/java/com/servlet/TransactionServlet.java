package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.Data_dao;
import com.model.Account;


/**
 * Servlet implementation class TransactionServlet
 */
@WebServlet("/TransactionServlet")
public class TransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Data_dao dao=new Data_dao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionServlet() {
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
		String ac_no=request.getParameter("accountNumber");
		String amount=request.getParameter("amount");
		String type=request.getParameter("type");
		
	Account a=new Account();
		a.setAc_no(ac_no);
		a.setAmount(Double.parseDouble(amount));
		a.setT_type(type);
		
		String s=dao.InsertTransaction(a);
		if("Inserted".equalsIgnoreCase(s)) {
			RequestDispatcher rd=request.getRequestDispatcher("Bank_web.jsp");
			rd.forward(request, response);
		}
		doGet(request, response);
	}

}
