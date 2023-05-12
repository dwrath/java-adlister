<%--
  Created by IntelliJ IDEA.
  User: damianwrather
  Date: 5/10/23
  Time: 11:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>
    <label>Guess a number between 1 and 3</label>
    <form action="guess" method="post">
        <input type="text" name="guess" />
        <input type="submit" value="Guess" />
    </form>
</body>
</html>
