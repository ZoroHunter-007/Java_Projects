package com.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.Dao.DataDao_Class;
import com.Model.Account;
/**
 * Servlet implementation class Account
 */
@WebServlet("/acc")
public class Acc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Acc() {
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
		
		String Acc_no=request.getParameter("account_num");
		String Holder_nm=request.getParameter("holder_nm");
		String Acc_type=request.getParameter("account_type");
		String balance=request.getParameter("balance");
		

		Account a=new Account();
		a.setAc_no(Integer.parseInt(Acc_no));
		a.setHolder_name(Holder_nm);
		a.setAc_type(Acc_type);
		a.setBalance(Double.parseDouble(balance));
		
		DataDao_Class d=new DataDao_Class();
		d.InsertAcccount(a);
		RequestDispatcher rd=request.getRequestDispatcher("Bank_Homepage.jsp");
		rd.forward(request, response);
		
		doGet(request, response);
	}

}
