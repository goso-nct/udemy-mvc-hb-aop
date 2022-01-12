<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created: vg, 12.01.2022 14:38
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Info</title>
</head>
<body>
<h2>Employee Info</h2>
<br/>
<form:form action="saveEmployee" modelAttribute="emp">

    <form:hidden path="id"/>
    Name: <form:input path="name"/><br/>
    Surname: <form:input path="surname"/><br/>
    Department: <form:input path="department"/><br/>
    Salary: <form:input path="salary"/><br/>

    <input type="submit" value="Ok">

</form:form>
</body>
</html>
