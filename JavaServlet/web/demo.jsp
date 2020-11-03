<%--jstl核心标签库 头文件--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: stud
  Date: 2019/12/1
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jstl</title>
</head>
<body>
<%--begin开始 end结束 var变量名--%>
<c:forEach begin="1" end="100" var="k">
    <h3>${k}</h3>
</c:forEach>

</body>
</html>
