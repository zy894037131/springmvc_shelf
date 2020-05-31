<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Hello World!</h2>
<a href="emps">查询所有员工</a>
<form action="saveEmp" method="get">
    id:<input type="text" name="id" ><br></br>
    姓名:<input type="text" name="lastName"><br></br>
    性别:<input type="text" name="gender"><br></br>
    emial:<input type="text" name="email"><br></br>
    <button type="submit"></button>
</form>
</body>
</html>
