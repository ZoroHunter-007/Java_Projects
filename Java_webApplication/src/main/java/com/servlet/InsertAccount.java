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
 * Servlet implementation class InsertAccount
 */
@WebServlet("/InsertAccount")
public class InsertAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Data_dao dao=new Data_dao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAccount() {
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
		String account_num=request.getParameter("account_num");
		String holder_nm=request.getParameter("holder_nm");
		String account_type=request.getParameter("account_type");
		String balance=request.getParameter("balance");
		
		Account a=new Account();
		a.setAc_number(account_num);
		a.setHolder_name(holder_nm);
		a.setAc_type(account_type);
		a.setBalance(Double.parseDouble(balance));
		String s=dao.InsertAccount(a);
		if("Inserted".equalsIgnoreCase(s)) {
			RequestDispatcher rd=request.getRequestDispatcher("Bank_web.jsp");
			rd.forward(request, response);
		}
		
		doGet(request, response);
	}

}
