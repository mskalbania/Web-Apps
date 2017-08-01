<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <style>
        .menu h3 {
            text-align: center;
        }

        .menu ol {
            display: table;
            margin: 0 auto;
        }

        .menu img {
            margin-top: 20px;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
<div class="menu">
    <h3>MAIN MENU<br>
        <img src="${pageContext.request.contextPath}/images/TrollFace.jpg" height="70" width="100"/>
    </h3>
    <ol>
        <li><h4><a href="${pageContext.request.contextPath}/first-page">HEADINGS | LISTS</a> <br></h4></li>
        <li><h4><a href="${pageContext.request.contextPath}/second-page">IMAGES</a></h4></li>
        <li><h4><a href="${pageContext.request.contextPath}/third-page">TABLES | FORMS</a></h4></li>
    </ol>
</div>
</body>
</html>
