<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />

<div class="container">
    <h1>Here Are all the ads!</h1>

    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
        </div>
    </c:forEach>
</div>
=======
<%@ page import="models.Ad" %>
<%@ page import="dao.ListAdsDao" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: damianwrather
  Date: 5/11/23
  Time: 1:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>
<h1>Ads</h1>
<ul>
    <% ListAdsDao listAdsDao = new ListAdsDao();
    List<Ad> ads = listAdsDao.all();
    for (Ad ad : ads) { %>
    <li><%= ad.getTitle()+ " - "+ad.getDescription() %></li>
    <% } %>

    <c:forEach var="ad" items="${ads}">
        <li>${ad.title} - ${ad.description}</li>
    </c:forEach>
</ul>

</body>
</html>
