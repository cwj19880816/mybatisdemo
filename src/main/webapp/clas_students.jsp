<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/11 0011
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="student" items="${requestScope.students}">
    ${student.student_name}<br/>
</c:forEach>
</body>
</html>
