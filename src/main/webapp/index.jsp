<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int count = 0; %>
<% count++; %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>

<h1>Implicit Objects in action:</h1>
<p>Path: <%=request.getRequestURL()%></p>
<p>Query String: <%=request.getQueryString()%></p>
<p>"name" parameter: <%=request.getParameter("name")%></p>
<p>"method" attribute: <%=request.getMethod()%></p>

<h2>Expression Language/ EL:</h2>
<p></p>
    <h1>Count: <%= count %></h1>
    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>

</body>
</html>
