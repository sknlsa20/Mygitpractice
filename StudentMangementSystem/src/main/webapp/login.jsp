<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String msg = request.getParameter("msg");

if(msg!=null)
{
out.print(msg);	
}

%>
<form action="./login">
Enter user name: <input type="text" name="uname"/><br/>
Enter password : <input type="password" name="pwd"/><br/>
<input type="submit" value="login"></input type="reset"/>
</form>

</body>
</html>