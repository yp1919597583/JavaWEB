
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String base = request.getScheme() + "://" +request.getServerName() +":"+ request.getServerPort()  + request.getContextPath() +"/";%>
<html>
<base href="<%=base%>">
<script src="https://cdn.bootcdn.net/ajax/libs/layui/2.7.6/layui.js"></script>
<link href="//unpkg.com/layui@2.7.6/dist/css/layui.css" rel="stylesheet">
<script src="../js/jquery.js"></script>
<body>
<ul class="layui-nav" lay-filter="" style="background-color: #31BDEC">
    <li class="layui-nav-item layui-this"><a href="manager/bookmanger.jsp" target="content">图书管理</a></li>
    <li class="layui-nav-item " ><a href="manager/ordermanger.jsp" target="content">订单管理</a></li>
    <li class="layui-nav-item"><a href="">返回商场</a></li>
    <li class="layui-nav-item "><a href="">社区</a></li>
</ul>
    <iframe src="manager/bookmanger.jsp" frameborder="0" width="100%" height="100%" name="content"></iframe>
<script>
    //注意：导航 依赖 element 模块，否则无法进行功能性操作
    layui.use('element', function(){
        var element = layui.element;

        //…
    });

</script>
</body>
</html>
