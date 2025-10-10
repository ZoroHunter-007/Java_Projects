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

import com.dao.DataDao;

import com.model.User_reg;


/**
 * Servlet implementation class ShowData
 */
@WebServlet("/ShowData")
public class ShowData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int RECORDS_PER_PAGE = 5;
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
            	DataDao dao =new DataDao();
                int id = Integer.parseInt(idParam);
                byte[] imgBytes = dao.ImageShow(id);

                if (imgBytes != null) {
                    response.setContentType("image/jpeg");
                    OutputStream out = response.getOutputStream();
                    out.write(imgBytes);
                    out.flush();
                    out.close();
                    
            		/*RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
            		rd.forward(request, response);*/
                   
                } else {
                    response.sendError(HttpServletResponse.SC_NOT_FOUND, "Image not found");
                    return;
                }
            } catch (NumberFormatException e) {
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid ID format");
                return;
            }
        }
        int page = 1;
        if (request.getParameter("page") != null) {
            page = Integer.parseInt(request.getParameter("page"));
        }

        DataDao dao = new DataDao();
        List<User_reg> list = dao.getUserByPage((page - 1) * RECORDS_PER_PAGE, RECORDS_PER_PAGE);
        int totalRecords = dao.getTotalUser();
        int totalPages = (int) Math.ceil(totalRecords * 1.0 / RECORDS_PER_PAGE);

        request.setAttribute("List", list);
        request.setAttribute("currentPage", page);
        request.setAttribute("totalPages", totalPages);

        
		
		DataDao d=new DataDao();
		List<User_reg>list1=d.showAllData();
		request.setAttribute("List1", list1);
		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
