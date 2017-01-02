<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wafer
  Date: 17/1/2
  Time: 00:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Result</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>
            Student id
        </th>

        <th>
            Student number
        </th>
    </tr>
    </thead>

    <tbody>
    <tr>
        <td>
            <s:property value="studentId" />
        </td>
        <td>
            <s:property value="studentNumber" />
        </td>
    </tr>
    </tbody>
</table>
</body>
</html>
