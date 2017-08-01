<%--
  Created by IntelliJ IDEA.
  User: mateusz
  Date: 01.08.17
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TABLES</title>
</head>
<body>
<table border="1">
    <thead>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Age</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>Mateusz</td>
        <td>Skalbania</td>
        <td>21</td>
    </tr>
    <tr>
        <td>SomeName</td>
        <td>SomeSurname</td>
        <td>25</td>
    </tr>
    </tbody>
</table>

<h2>REGISTER</h2>
<form method="post">
    <div>
        <label>First Name: <input type="text" placeholder="John" required></label>
        <label>Last Name: <input type="text" placeholder="Smith" required></label>
    </div>
    <div>
        <label>Male <input name="genderPick" value="MALE" type="radio" checked></label>
        <label>Female <input name="genderPick" value="FEMALE" type="radio"></label>
        <label>Other <input name="genderPick" value="OTHER" type="radio"></label>
    </div>
    <div>
        <label>Email: <input type="email" placeholder="ex@gmail.com" required></label>
        <label>Password: <input type="password" required maxlength="10" minlength="5"></label>
    </div>
    <div>
        <label>Birthday: <input type="date" required></label>
    </div>
    <div>
        <label>I agree on terms and conditions <input type="checkbox" required></label>
    </div>
    <input type="submit" value="Submit">
</form>

</body>
</html>
