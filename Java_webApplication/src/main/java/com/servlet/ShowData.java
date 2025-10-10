package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import com.dao.Data_dao;
import com.model.user_reg;

/**
 * Servlet implementation class ShowData
 */
@WebServlet("/ShowData")
public class ShowData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String idParam = request.getParameter("id");
		 
	        if (idParam != null && !idParam.isEmpty()) {
	            try {
	            	Data_dao dao =new Data_dao();
	                int id = Integer.parseInt(idParam);
	                byte[] imgBytes = dao.showImage(id);

	                if (imgBytes != null) {
	                    response.setContentType("image/jpeg");
	                    OutputStream out = response.getOutputStream();
	                    out.write(imgBytes);
	                    out.flush();
	                    out.close();
	                    
	            		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
	            		rd.forward(request, response);
	                   
	                } else {
	                    response.sendError(HttpServletResponse.SC_NOT_FOUND, "Image not found");
	                    
	                }
	            } catch (NumberFormatException e) {
	                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid ID format");
	             
	            }
	        }
	        else {

		Data_dao d=new Data_dao();
		List<user_reg>list=d.showAllData();
		request.setAttribute("List", list);
		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
	        }
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
