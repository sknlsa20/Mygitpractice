package com.src;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.dao.StudentDAOImpl;
import com.src.model.Student;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int stdid= Integer.parseInt(request.getParameter("sid"));
		String stdname= request.getParameter("sname");
		String stdaddress= request.getParameter("saddress");
		int stdage= Integer.parseInt(request.getParameter("sage"));
		long stdmob= Long.parseLong(request.getParameter("smob"));
		
		Student s = new Student(stdid,stdname,stdaddress,stdage,stdmob);		
		StudentDAOImpl sdao=new StudentDAOImpl();
		sdao.getMyConnection();
		
		ServletContext scon= getServletContext();
		
		System.out.println(scon.getInitParameter("url"));
		
		sdao.edit(s);
		sdao.closeConnection();
		
		response.sendRedirect("index.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
