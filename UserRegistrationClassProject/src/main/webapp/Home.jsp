<%@page import="com.pack1.UserBean" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <center>
    <h1>
      <%
         UserBean ub = (UserBean) application.getAttribute("UserBean");
         out.println("Welcome "+ub.getUfname()+" <br><br>");
      %>
      <a href="view">View Profile</a><br><br>
      <a href="logout">Logout</a><br><br>
    </h1>

</body>
</html>