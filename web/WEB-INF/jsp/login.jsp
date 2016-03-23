<%--
  Created by IntelliJ IDEA.
  User: zhangx-ae
  Date: 2016/3/3
  Time: 14:20
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login  Page</title>
</head>
<body>
    <h1>Login</h1>
    <br>
    <%--${sessionScope.SPRING_SECURITY_LAST_EXCEPTION.message}--%>
    <br>
    ${error}
    <br>
    <form action="/SSD2/auth/login" method="post">
        <p>
            <label for="j_username">Username</label><input id="j_username" name="j_username" type="text">
        </p>
        <p>
            <label for="j_password">Password</label><input id="j_password" name="j_password" type="password">
        </p>
        <input type="submit" value="login">
    </form>
</body>
</html>
