<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
<head>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main-menu.css">

</head>
<body>
<div class="menu">
    <h3>MAIN MENU<br>
        <img src="${pageContext.request.contextPath}/images/TrollFace.jpg" height="70" width="100"/>
    </h3>
    <ol>
        <li><a href="${pageContext.request.contextPath}/first-page">HEADINGS | LISTS</a> <br></li>
        <li><a href="${pageContext.request.contextPath}/second-page">IMAGES</a></li>
        <li><a href="${pageContext.request.contextPath}/third-page">TABLES | FORMS</a></li>
        <li><a href="${pageContext.request.contextPath}/fourth-page">CSS SELECTORS</a></li>
    </ol>
</div>
</body>
</html>
