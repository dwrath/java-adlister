<%--
  Created by IntelliJ IDEA.
  User: damianwrather
  Date: 5/10/23
  Time: 11:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Color</title>
  <style>
    body {
      background-color: <%= request.getParameter("color") %>;
    }
  </style>
</head>
<body>
  <h1>View Color</h1>

</body>
</html>
