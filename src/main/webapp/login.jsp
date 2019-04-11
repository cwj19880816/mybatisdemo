<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form name="loginform" id="loginform" action="loginServlet" method="post">
    用户名：<input type="text" name="username" id="username"/><br/>
    密&nbsp;&nbsp;码：<input type="password" name="userpassword" id="userpassword"/><br/>
    <input type="submit" name="submit" id="submit" value="登录">
</form>
</body>
</html>
