<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/4/6
  Time: 23:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="layui.jsp"%>
<div class="daohang" style="height: 50px">
    <a href="javascript:;" class="fast">记录</a>
    <a href="#" class="left">联系作者</a>
    <a href="manager/backstage.jsp" class="dl">后台管理</a>
    <a href="html/jsru.jsp" class="left">加入我们</a>
<%--    没登录就显示注册登录,登录后就显示用户名头像--%>
    <c:if test="${empty sessionScope.get('username')}">

        <a href="html/login.jsp" class="dl">登录</a>
        <a href="html/register.jsp" class="dl">注册</a>
    </c:if>
<%--    登陆了就显示用户信息--%>
    <c:if test="${not empty sessionScope.get('username')}">
        <ul class="layui-nav layui-bg-molv dl" style="float: right;background-color: #e3e4e5; ">
            <li class="layui-nav-item">
                <a href="" style="color: #4c4c4c; text-align: center;line-height: 50px;" >注销</a>
            </li>
            <li class="layui-nav-item">
                <a href="" style="color: #4c4c4c;text-align: center;line-height: 50px">订单管理<span class="layui-badge">6</span></a>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:; " style="color: #4c4c4c;text-align: center;line-height: 50px"><img src="img/BookImg/sj6.jpeg" class="layui-nav-img">${sessionScope.get("username")}</a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;">修改信息</a></dd>
                    <dd><a href="javascript:;">安全管理</a></dd>
                    <dd><a href="userServlet?action=quitLogin">退出登录</a></dd>
                </dl>
            </li>
        </ul>
    </c:if>

</div>

<div class="nav_serch">
    <span>小样,今天读书了吗!</span>
    <div class="logo" title="智博书城,让知识无价!"></div>
    <div class="index_serch"><input type="text" value="福尔摩斯探案集">
        <button>搜索</button>
        <div class="shopping_cart ">
            <div class="shopp_count"><i>0</i></div>
            <a href="javascript:;">我的购物车</a></div>
    </div>
    <div class="hotwords"><a href="javascipt:;">Java编程思想</a><a href="javascipt:;">动物王国</a><a href="javascipt:;">格林童话</a><a href="javascipt:;">伊索寓言</a><a href="javascipt:;">一千零一页</a></div>
</div>

