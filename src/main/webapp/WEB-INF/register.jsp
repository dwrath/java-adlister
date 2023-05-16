<%--
  Created by IntelliJ IDEA.
  User: damianwrather
  Date: 5/16/23
  Time: 2:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h1>Register</h1>
<form method="POST" action="register">
    <label for="username">Username:</label>
    <input type="text" name="username" id="username" />
    <br />
    <label for="password">Password:</label>
    <input type="password" name="password" id="password" />
    <br />
    <label for="email">Email:</label>
    <input type="text" name="email" id="email" />
    <br />
    <input type="submit" value="Register" />
</form>

</body>
</html>
