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
          String uname = (String) request.getAttribute("user_name");
          UserBean ub = (UserBean) application.getAttribute("UserBean");
          out.println("This session belongs to "+uname+" !!! <br><br>");
          out.println("<u>Profile Details</u> <br><br>");
          
          String pwd = ub.getUpwd();
          String encryptPass = pwd.substring(0,1)+"****"+pwd.substring(pwd.length()-1);
          
          out.println(ub.getUname()+" "+encryptPass+" "+ub.getUfname()+" "+ub.getUlname()+" "+ub.getUmail()+" "+ub.getUphone()+"<br><br>");
        %>
         <a href="edit">Edit Profile</a><br><br>
         <a href="logout">Logout</a><br><br>
     </h1>
</body>
</html>