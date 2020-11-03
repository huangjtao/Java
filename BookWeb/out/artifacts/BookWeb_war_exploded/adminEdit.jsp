<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员修改</title>
    <link rel="stylesheet" href="layui/css/layui.css" />
    <script type="text/javascript" src="layui/layui.js"></script>
</head>
<body>
<form class="layui-form" action="admininfoupdate" method="post" style="width: 50%;">
    <input type="hidden" name="id" value="${admin.id}"/>
    <div class="layui-form-item">
        <label class="layui-form-label">管理员姓名</label>
        <div class="layui-input-block">
            <input type="text" name="username" value="${admin.username}" required  lay-verify="required" placeholder="请输入管理员姓名" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">管理员密码</label>
        <div class="layui-input-inline">
            <input type="password" name="password" value="${admin.password}" required lay-verify="required" placeholder="请输入管理员密码" autocomplete="off" class="layui-input">
        </div>
        <div class="layui-form-mid layui-word-aux">密码需要6位以上</div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">管理员头像</label>
        <div class="layui-input-block">
            <input type="text" name="picurl" value="${admin.picurl}" required  lay-verify="required" placeholder="请输入管理员头像 可以使用网络图片" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>

<script>
    //Demo
    layui.use('form', function(){
        var form = layui.form;


    });
</script>


</body>
</html>
