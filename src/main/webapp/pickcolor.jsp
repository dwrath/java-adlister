<%--
  Created by IntelliJ IDEA.
  User: damianwrather
  Date: 5/10/23
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color picker</title>
</head>
<body>
  <h1>Color picker</h1>
    <form action="viewcolor" method="post">
        <label for="color">Pick Color:</label>
        <input type="text" id="color" name="color">
        <input type="submit" value="Submit">
    </form>
</body>
</html>
