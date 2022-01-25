package com.src;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.src.dao.StudentDAOImpl;
import com.src.model.User;

/**
 * Servlet implementation class LogicServlet
 */
public class LogicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogicServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String u = request.getParameter("uname");
		String p = request.getParameter("pwd");
		
		StudentDAOImpl sdao =new StudentDAOImpl();
		
		sdao.getMyConnection();
		
		User user =new User(u,p);		
		boolean result=sdao.validateUser(user);
		
		if(result)
		{
			response.sendRedirect("index.jsp?u="+u);
		}
		else
		{
			String msg="invalid username or password";
			response.sendRedirect("login.jsp?msg="+msg);
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
