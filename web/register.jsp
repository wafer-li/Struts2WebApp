<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wafer
  Date: 17/1/2
  Time: 00:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<s:form action="register">
    <s:textfield name="id" label="Id" type="number" />
    <s:password name="password" label="password"/>
    <s:submit label="register"/>
</s:form>
</body>
</html>
