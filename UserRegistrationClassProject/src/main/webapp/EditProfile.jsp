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
        UserBean ub = (UserBean)application.getAttribute("UserBean");
        String uname = (String) request.getAttribute("user_name");
        out.println("This session belongs to "+uname+" !!! <br><br>");
        out.println("<u>Edit Profile </u> <br><br>");
        %>
        <form action="update" method="post">
          FirstName <input type="text" name="fname" value="<%= ub.getUfname() %>"><br><br>
          LastName <input type="text" name="lname" value="<%= ub.getUlname() %>"><br><br>
          Mail Id <input type="text" name="mail" value="<%= ub.getUmail() %>"><br><br>
          Phone No. <input type="text" name="phone" value="<%= ub.getUphone() %>"><br><br>
          <input type="submit" value="Update">
        </form>
        </h1>
      
</body>
</html>