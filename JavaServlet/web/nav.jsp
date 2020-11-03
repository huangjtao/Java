<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--公共导航页面--%>

<ul class="layui-nav" lay-filter="">
    <li class="layui-nav-item"><a href="data.jsp">用户列表</a></li>
    <li class="layui-nav-item layui-this"><a href="add.jsp">用户添加</a></li>
    <li class="layui-nav-item"><a href="data.jsp">用户管理</a></li>
    <li class="layui-nav-item">
        <a href="javascript:;">解决方案</a>
        <dl class="layui-nav-child"> <!-- 二级菜单 -->
            <dd><a href="">移动模块</a></dd>
            <dd><a href="">后台模版</a></dd>
            <dd><a href="">电商平台</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item"><a href="">社区</a></li>
</ul>

<script>
    //注意：导航 依赖 element 模块，否则无法进行功能性操作
    layui.use('element', function(){
        var element = layui.element;

        //…
    });
</script>