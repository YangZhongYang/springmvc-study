<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    登录名：<input type="text" name="loginname"><br>
    密码：<input type="text" name="loginpass"><br>
    Email:<input type="email" name="email"><br>
    生日：<input type="text" name="birthday"><br>
    爱好：<input type="checkbox" value="跑步" name="hobit">跑步 | <input type="checkbox" value="游泳" name="hobit"> 游泳 <br>
    <input type="submit" value="Login">
</form>
</body>
</html>
