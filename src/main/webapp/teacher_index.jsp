<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="entity.Teacher" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>teacher_index</title>
    <%
        Teacher teacher=(Teacher) session.getAttribute("teacher");
        String name=teacher.getTeacher_name();
    %>
</head>
<body>
<%=name %>，登录成功！<br/>
<c:forEach var="clas" items="${sessionScope.clases}">
    ${clas.clas_name}<br/>
</c:forEach>
</body>
</html>
