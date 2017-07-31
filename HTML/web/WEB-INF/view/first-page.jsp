<!doctype html>
<html>
<head>
    <style>
        .returnButton button{
            background-color: #72af11; /* Green */
            margin-top: 20px;
            border-radius: 10px;
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
        }
    </style>
</head>
<body>
<h1><b>HEADING SIZES | LISTS</b>
    <form class="returnButton">
        <button formaction="${pageContext.request.contextPath}/">RETURN</button>
    </form>
</h1>
<%--h sizes--%>
<ol>
    <h1>
        <li> h1 tag</li>
    </h1>
    <h2>
        <li> h2 tag</li>
    </h2>
    <h3>
        <li> h3 tag</li>
    </h3>
    <h4>
        <li> h4 tag</li>
    </h4>
    <h5>
        <li> h5 tag</li>
    </h5>
    <h6>
        <li> h6 tag</li>
    </h6>
</ol>
<ul>
    <p>
    <li> p tag</li>

    <li><strong>strong</strong></li>

    <li><em>italic</em></li>
    </p>
</ul>
<h2>------------------------------------------------------------------------------</h2>
<h1>Things</h1>

<h3>Internet Basics</h3>
<p>
<ol>
    <li>HTTP Requests</li>
    <li>IP Addresses</li>
    <li>Servers</li>
</ol>
</p>
<h3>HTML</h3>
<p>
<ul>
    <li>Stands for <strong>Hypertext Markup Language</strong></li>
    <li>Lots of tags
        <ul>
            <li>Boilerplate
                <ol>
                    <li>Doctype</li>
                    <li>HTML</li>
                    <li>Head
                        <ol>
                            <li>Title</li>
                        </ol>
                    </li>
                    <li>Body</li>
                </ol>
            </li>
            <li>Headings</li>
            <li>Paragraph</li>
            <li><em>em</em></li>
            <li><strong>strong</strong></li>
        </ul>
    </li>
</ul>
</p>
</body>
</html>
