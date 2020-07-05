<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>员工列表</title>
    <script type="text/javascript"
            src="<%=request.getContextPath()%>/static/js/jquery-1.12.4.min.js"></script>
    <link
            href="<%=request.getContextPath()%>/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
            rel="stylesheet">
    <script
            src="<%=request.getContextPath()%>/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<h2>Hello World!</h2>
<a href="emps">查询所有员工</a>
<form action="saveEmp" method="get">
    id:<input type="text" name="id" ><br></br>
    姓名:<input type="text" name="lastName"><br></br>
    性别:<input type="text" name="gender"><br></br>
    emial:<input type="text" name="email"><br></br>
    <button type="submit"></button><br>
    <button type="button" class="btn btn-success">Success</button>
</form>
</body>
</html>
