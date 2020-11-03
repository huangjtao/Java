<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: stud
  Date: 2019/12/1
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script type="text/javascript" src="layui/layui.js"></script>
</head>
<body>

<table class="layui-table">
    <tr>
        <td>管理员ID</td>
        <td>管理员用户名</td>
        <td>管理员密码</td>
        <td>管理员头像</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${adminList}" var="a">
        <tr>
            <td>${a.id}</td>
            <td>${a.username}</td>
            <td>${a.password}</td>
            <td><img src="${a.picurl}" width="50"/></td>
            <td>
                <a href="adminEdit?id=${a.id}" class="layui-btn layui-btn-normal layui-btn-radius">
                    <i class="layui-icon layui-icon-edit"></i>
                    修改
                </a>
                <a href="adminDelete?id=${a.id}" class="layui-btn layui-btn-danger layui-btn-radius">
                    <i class="layui-icon layui-icon-delete"></i>
                    删除
                </a>
        </tr>
    </c:forEach>

</table>

</body>
</html>
