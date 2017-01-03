<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wafer
  Date: 17/1/1
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<h1>Login</h1>

<s:form action="login">
    <s:textfield name="id" label="Id" type="number" />
    <s:password name="password" label="password"/>
    <s:submit/>
</s:form>

<a href="register.jsp"> Register </a>
</body>
</html>
