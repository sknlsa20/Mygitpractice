<%@ page language="java" import="java.sql.*,java.util.*,com.src.dao.StudentDAOImpl,com.src.model.Student" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
Cookie ck[]=request.getCookies();
String u=ck[0].getValue();

%>
<body>
<form action="./register" method="post">

Enter student Id : <input type="text" name="sid"/><br>
Enter student Name : <input type="text" name="sname"/><br>
Enter student address : <textarea name="saddress"></textarea><br>
Enter student age : <input type="text" name="sage"/><br>
Enter student mobileno : <input type="text" name="smob"/><br>
<input type="hidden" name="uname" value="<%=u%>"/>
<input type="submit"/><input type="reset"/>
</form>

</body>
</html>