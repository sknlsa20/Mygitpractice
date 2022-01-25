<%@ page language="java" import="java.sql.*,java.util.*,com.src.dao.StudentDAOImpl,com.src.model.Student" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String user = request.getParameter("u");
if(user!=null)
{
out.print("welcome to "+user);	
}

Cookie ck = new Cookie("us",user);
response.addCookie(ck);


HttpSession ses = request.getSession(true);

ses.setAttribute("ur",user);

%>
<br/>
<a href="registerstd.jsp">Add Student</a>
<table border="1" bgcolor="aqua">
<tr>
	<th>stdid</th>
	<th>stdname</th>
	<th>stdaddress</th>
	<th>stdage</th>
	<th>stdmobile</th>
	<th></th>
	<th></th>
</tr>
<% 
StudentDAOImpl sdao =new StudentDAOImpl();
sdao.getMyConnection();

ArrayList<Student> al = sdao.getStudents();
for(Student s : al)
{

%>
<tr>
	<td><%=s.getStdid()%></td>
	<td><%=s.getStdname() %></td>
	<td><%=s.getStdaddress() %></td>
	<td><%=s.getStdage() %></td>
	<td><%=s.getStdmobileno() %></td>
	<td><a href="./DeleteServlet?sid=<%=s.getStdid()%>">Del</a></td>
	<td><a href="updatestudent.jsp?sid=<%=s.getStdid()%>">Edit</a></td>
</tr>
<%} 

sdao.closeConnection();
%>

</table>

</body>
</html>