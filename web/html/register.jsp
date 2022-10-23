<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>注册</title>
    <%
        //动态获取服务器地址
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";

    %>
<%--    不能使用el输出--%>

    <base href="<%=basePath%>">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/register.css" >
    <script src="js/register.js"></script>
<!--    base标签永远固定相对路径-->

</head>


<body>
<header>
    <div>
    <a href="index.jsp" title="智博书城"><img src="img/icoimg/bj.png" alt=""></a>
    </div>
</header>
<div class="bod">
    <h3>
        欢迎注册，智博书城!
        <div class="nav-login">已经注册！直接<a href="html/login.jsp">登录</a></div>
    </h3>

<div class="main">
    <form action="userServlet" method="post" onsubmit="return pd();">
<%-- <%=request.getAttribute("regist_message")==null?"请输入1-8位!":request.getAttribute("regist_message")%> --%>
    <div class="ID"><label for="id" class="lb">会员名:</label><input type="text" id="id" class="t1" name="username"><p>${empty requestScope.regist_message?"请输入1-8位!":requestScope.regist_message}</p></div>
    <div class="passWord"><label for="passWord" class="lb">密码:</label><input type="password" id="passWord" class="t1" name="password"><p>6-11位包含大小写!</p></div>
    <div class="tle"><label for="tle" class="lb">电话:</label><input type="text" id="tle" class="t1" name="phonenumber"><p>${empty requestScope.regist_message2?"11位电话号码!":requestScope.regist_message2}</p></div>
    <div class="emile"><label for="mile" class="lb">邮箱:</label><input type="email" id="mile" class="t1" name="email"><p>输入邮箱!</p></div>
    <input type="submit" id="last" value="提交注册">
        <input type="hidden" name="action" value="register">
    </form>

</div>

</div>
</body>
</html>

