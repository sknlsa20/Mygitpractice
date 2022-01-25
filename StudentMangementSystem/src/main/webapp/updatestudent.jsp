<%@ page language="java" import="com.src.dao.*,com.src.model.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

HttpSession ses= request.getSession(false);
String user=(String)ses.getAttribute("ur");


int i=Integer.parseInt(request.getParameter("sid"));
StudentDAOImpl sdao=new StudentDAOImpl();
sdao.getMyConnection();
Student s=sdao.getStudent(i);
System.out.println(s);
out.print(user);
%>
<form action="./update" method="post">
Enter student Id : <input type="hidden" value="<%=i%>" name="sid"/><br>
Enter student Name : <input type="text" value="<%=s.getStdname()%>" name="sname"/><br>
Enter student address : <textarea value="<%=s.getStdaddress()%>" name="saddress"></textarea><br>
Enter student age : <input type="text" value="<%=s.getStdage()%>" name="sage"/><br>
Enter student mobileno : <input type="text" value="<%=s.getStdmobileno()%>" name="smob"/><br>
<input type="submit"/><input type="reset"/>
</form>
<%sdao.closeConnection(); %>
</body>
</html>