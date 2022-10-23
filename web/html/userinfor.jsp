
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="../common/layui.jsp"%>
<%@include file="../common/base.jsp"%>
<head>
    <title>我的信息</title>
</head>
<body>
<ul class="layui-nav layui-bg-molv">
    <li class="layui-nav-item">
        <a href="">注销</a>
    </li>
    <li class="layui-nav-item layui-this">
        <a href="">订单管理<span class="layui-badge">6</span></a>
    </li>
    <li class="layui-nav-item">
        <a href="index.jsp">进入市场</a>
    </li>
    <li class="layui-nav-item">
        <a href="javascript:;"><img src="img/BookImg/sj6.jpeg" class="layui-nav-img">${sessionScope.get("username")}</a>
        <dl class="layui-nav-child">
            <dd><a href="javascript:;">修改信息</a></dd>
            <dd><a href="javascript:;">安全管理</a></dd>
            <dd><a href="javascript:;">退出登录</a></dd>
        </dl>
    </li>
</ul>
</body>
    <script>

    </script>
</html>
