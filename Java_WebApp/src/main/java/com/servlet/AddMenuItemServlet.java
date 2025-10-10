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

import com.dao.DataDao;
import com.model.addMenu;

/**
 * Servlet implementation class AddMenuItemServlet
 */
@MultipartConfig
@WebServlet("/AddItemServlet")
public class AddMenuItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMenuItemServlet() {
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
		
		String itemName=request.getParameter("itemName");
		String Description=request.getParameter("itemDescription");
		String priceStr = request.getParameter("itemPrice");
		double price = 0.0;
		if (priceStr != null && !priceStr.trim().isEmpty()) {
		    price = Double.parseDouble(priceStr);
		}
		
		String cat=request.getParameter("itemCategory");
		Part img = request.getPart("itemImage");
		
		    InputStream is = img.getInputStream();
		   byte  b[]=is.readAllBytes();
		    // Save image...
		
		
		
		addMenu m=new addMenu();
		m.setItemName(itemName);
		m.setDescription(Description);
		m.setPrice(price);
		m.setCat(cat);
		m.setImageItem(b);
		
		DataDao dao=new DataDao();
		String s=dao.AddMenu(m);
		if("Inserted".equalsIgnoreCase(s)) {
			RequestDispatcher rd=request.getRequestDispatcher("addItem.jsp");
			rd.forward(request, response);
		}
		doGet(request, response);
	}

}
