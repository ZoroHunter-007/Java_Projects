package com.Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.Dao.DataDao_Class;
import com.Model.Register_Cust;

/**
 * Servlet implementation class RegisterPage
 */
@WebServlet("/RegisterPage")
public class RegisterPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterPage() {
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
	
		
		 String fullname = request.getParameter("fullname");
	        String email = request.getParameter("email");
	        String pno = request.getParameter("pno");
	        String password = request.getParameter("password");

	        // 2️⃣ Create entity object and set values
	        Register_Cust rc = new Register_Cust();
	        rc.setFullname(fullname);
	        rc.setEmail(email);
	        rc.setPno(pno);
	        rc.setPassword(password);

	        Mailer.send(email,"Account Registration Successfully","Welcome, "+fullname+" Your Account has been registred successfully.Thank you for choosing our bank application.");
	        // 3️⃣ Call DAO to save entity
	        DataDao_Class dao = new DataDao_Class();
	       
	            dao.InsertData(rc);
	            // 4️⃣ Redirect or show success message
	         RequestDispatcher rd=request.getRequestDispatcher("test.jsp");
	         rd.forward(request, response);
	       
		
		doGet(request, response);
	}

}
