<%@ page language="java" contentType="text/html"
    pageEncoding="utf-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ul>
<c:forEach var="var" items="${lista}">
<c:if test="${var.id==1}">
<li>
${var.id}
${var.getName()}

</li>
</c:if>
</c:forEach>

</ul>
</body>
</html>