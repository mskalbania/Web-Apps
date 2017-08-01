<%--
  Created by IntelliJ IDEA.
  User: mateusz
  Date: 01.08.17
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>IMAGES</title>
</head>
<body>
<h2>IMAGES</h2>
<div>
    <p>Image1</p>
    <img src="${pageContext.request.contextPath}/images/java.png">
    <p>Image2</p>
    <img src="${pageContext.request.contextPath}/images/spring.png">
</div>
<div><a href="${pageContext.request.contextPath}/">BACK</a></div>
</body>
</html>
