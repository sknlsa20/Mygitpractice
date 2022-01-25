package com.src;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.dao.StudentDAOImpl;
import com.src.model.Student;
import com.src.model.User;

/**
 * Servlet implementation class StudentRegisterServlet
 */
public class StudentRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegisterServlet() {
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
		
		String user=request.getParameter("uname");
		
		Student s = new Student(stdid,stdname,stdaddress,stdage,stdmob);		
		StudentDAOImpl sdao=new StudentDAOImpl();
		sdao.getMyConnection();
		
		ServletConfig sc =getServletConfig();
		
		String in=sc.getInitParameter("inf");
		System.out.println(in);
		
		String driver=sc.getInitParameter("driver-class");
		System.out.println(driver);
		
		User u =new User();
		u.setUsername(user);
		sdao.insert(s,u);
		sdao.closeConnection();
		
		Cookie ck = new Cookie("us","");		
		ck.setMaxAge(0);
		response.addCookie(ck);
		
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
