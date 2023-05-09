<%--
  Created by IntelliJ IDEA.
  User: damianwrather
  Date: 5/9/23
  Time: 10:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login</title>
</head>
<body>

<h1>Login</h1>
<form action="/login" method="post">
    <table>
        <tr>
            <td>Username:</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Login"/></td>
        </tr>
    </table>
    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username != null && password != null && username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        } else {
            response.sendRedirect("/login.jsp");
        }
    %>

</form>
</body>
</html>
