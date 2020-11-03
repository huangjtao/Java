<%@ page import="util.PersonDAO" %>
<%@ page import="util.Person" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: stud
  Date: 2019/11/29
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script type="text/javascript" src="layui/layui.js"></script>
    <style>
        .footer{padding: 30px 0;line-height: 30px;text-align: center;color: #666;font-weight: 300;}
    </style>
</head>
<body>

<jsp:include page="nav.jsp"></jsp:include>

<div class="layui-carousel" id="test1">
    <div carousel-item>
        <div><a href=""><img src="image/a.jpeg" style="height:100% ;width: 100%;"/></a></div>
        <div><img src="image/b.jpeg" style="height:100% ;width: 100%;"/></div>
        <div><img src="image/c.jpeg" style="height:100% ;width: 100%;"/></div>
        <div><img src="image/d.jpeg" style="height:100% ;width: 100%;"/></div>
        <!--        <div>条目5</div>-->
    </div>
</div>
<!-- 条目中可以是任意内容，如：<img src=""> -->

<script>
    layui.use('carousel', function(){
        var carousel = layui.carousel;
        //建造实例
        carousel.render({
            elem: '#test1'
            ,width: '100%' //设置容器宽度
            ,height:'500px'
            ,arrow: 'always' //始终显示箭头
            //,anim: 'updown' //切换动画方式
        });
    });
</script>

<table class="layui-table">
    <colgroup>
        <col width="150">
        <col width="300">
        <col width="500">
        <col>
    </colgroup>
    <tr>
        <td>用户ID</td>
        <td>用户姓名</td>
        <td>用户性别</td>
        <td>操作</td>
    </tr>

    <%
        PersonDAO dao = new PersonDAO();
        List<Person> personList = dao.getAll();
        //out.println(personList);

        for (Person person : personList) {
    %>
    <tr>
        <td><%out.println(person.getId()); %></td>
        <td><%=person.getName()%></td>
        <td><%=person.getSex()%></td>
        <td>
            <button class="layui-btn layui-btn-normal layui-btn-radius">
                <i class="layui-icon layui-icon-edit"></i>
                修改
            </button>
            <a href="personDelete?id=<%=person.getId()%>" class="layui-btn layui-btn-danger layui-btn-radius">
                <i class="layui-icon layui-icon-delete"></i>
                删除
            </a>

        </td>

    </tr>
    <%
        }

    %>

</table>

<div class="layui-footer footer footer-doc">
    <div class="layui-main">
        <p>© 2019 <a href="/">layui.com</a> MIT license</p>
        <p>
            <a href="http://fly.layui.com/case/2019/" target="_blank">案例</a>
            <a href="http://fly.layui.com/jie/3147/" target="_blank">支持</a>
            <!--<a href="javascript:;" site-event="contactInfo">联系</a>-->
            <a href="https://github.com/sentsin/layui/" target="_blank" rel="nofollow">GitHub</a>
            <a href="https://gitee.com/sentsin/layui" target="_blank" rel="nofollow">码云</a>
            <a href="http://fly.layui.com/jie/2461/" target="_blank" class="layui-hide-xs">公众号</a>
            <a href="http://www.miitbeian.gov.cn/" target="_blank" rel="nofollow">赣ICP备13006272号-2</a>
        </p>
        <div class="site-union">
            <p class="site-union-desc">
        <span>
          感谢以下平台提供云加速支持
        </span>
            </p>
            <p>
                <a href="https://console.upyun.com/register/?invite=SJ0wu6g2-" target="_blank" rel="nofollow" sponsor="upyun">
                    <img src="//res.layui.com/static/images/other/upyun.png?t=1">
                </a>
                <a href="https://www.maoyuncloud.com/?from=layui" target="_blank" rel="nofollow" sponsor="maoyun">
                    <img src="//cdn.layui.com/upload/2019_5/168_1559291577683_9348.png">
                </a>
            </p>
        </div>
    </div>
</div>

</body>
</html>
