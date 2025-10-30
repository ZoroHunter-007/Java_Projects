package com.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.Dao.DataDao_Class;
import com.Model.Register_Cust;

/**
 * Servlet implementation class Login
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
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		DataDao_Class dao = new DataDao_Class();
		Register_Cust rc = dao.checkLogin(email, password);   // <-- your DB login method

        if (rc != null) {

            // ✅ Get user data
            String name = rc.getFullname();
            String mail = rc.getEmail();
            long acno = rc.getAcc().getAc_no();  // int/double → long safe handling
            double balance = rc.getAcc().getBalance();
            String actype = rc.getAcc().getAc_type();

            // ✅ Sending data to JSP
            request.setAttribute("name", name);
            request.setAttribute("email", mail);
            request.setAttribute("acno", acno);
            request.setAttribute("balance", balance);
            request.setAttribute("ac_type", actype);

            RequestDispatcher rd = request.getRequestDispatcher("test.jsp");
            rd.forward(request, response);

		} else {
		    request.setAttribute("msg", "Invalid Email or Password!");
		    RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		    rd.forward(request, response);
		}
	}

}
