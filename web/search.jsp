<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wafer
  Date: 17/1/1
  Time: 22:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
</head>
<body>

<h1>Search</h1>

<s:form action="search">
    <s:textfield label="Student ID" name="studentId"/>
    <s:submit label="Search"/>
</s:form>
</body>
</html>
