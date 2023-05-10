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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
  <h1>Color picker</h1>
    <form action="viewcolor" method="post">
        <label class="form-label" for="color">Pick Color:</label>
        <input class="form-control" type="text" id="color" name="color">
        <input class="btn btn-primary" type="submit" value="Submit">
    </form>
</body>
</html>
