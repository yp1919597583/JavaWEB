<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%
    String base=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
    %>
    <base href="<%=base%>">
    <title>智博二手书-让文字活跃起来!</title>
    <meta name="description" content="智博二手书市场,让知识无价!">
    <meta name="keywords" content="二手书">
    <script src="js/lb.js"></script>
    <link rel="stylesheet" href="css/index.css">
    <link rel="shortcut icon" href="img/favicon.ico"  type="image/x-icon">
    <link rel="stylesheet" href="css/base.css">
    <script src="js/jquery.js"></script>
    <link rel="stylesheet" href="//unpkg.com/layui@2.6.8/dist/css/layui.css">

    <%@include file="common/yr.jsp"%>
    <style>
        .logo {
            width: 140px;
            height: 140px;
            background: url("img/logo.jpeg") center;
            position: absolute;
            left: 500px;
            top: 20px;
            /* 去掉鼠标点击出现竖线 */
            caret-color: rgba(0, 0, 0, 0);
            cursor: pointer;
        }
        #test1 {
            position: absolute;
            left: 600px;
            top: 300px;
        }
        .box {
            position: absolute;
            top: 800px;
            left: 200px;
        }
    </style>

</head>


<body>

<div class="kongbai">


</div>

<%@include file="common/nav_nom.jsp"%>
<!-- 轮播栏 -->

<div class="nav_cat_menu">
    <ul>
        <li><a href="javascript:;">武侠</a>/<a href="javascript:;">典藏</a>/<a href="javascrpt:;">90年代</a></li>
        <li><a href="javascript:;">四大名著</a>/<a href="javascript:;">西游记</a>/<a href="javascript:;">水浒传</a></li>
        <li><a href="javascript:;">编程</a>/<a href="javascript:;">深入理解JVM</a>/<a href="javascript:;">Java并发编程</a></li>
        <li><a href="javascript:;">古诗</a>/<a href="javascript:;">唐诗300首</a>/<a href="javascript:;">宋词300首</a></li>
        <li><a href="javascript:;">漫画</a>/<a href="javascript:;">知音漫客</a>/<a href="javascript:;">神漫</a></li>
        <li><a href="javascript:;">儿童读物</a>/<a href="javascript:;">一千零一页</a>/<a href="javascript:;">格林童话</a></li>
        <li><a href="javascript:;">小说</a>/<a href="javascript:;">都市</a>/<a href="javascript:;">言情</a></li>
        <li><a href="javascript:;">外国名著</a>/<a href="javascript:;">红与黑</a>/<a href="javascript:;">神秘岛</a></li>

    </ul>

</div>




<%--div<div class="lb">--%>
<%--    <ul class="lb_img">--%>
<%--        <li><img src="img/lbimg/lb_1.jpeg" alt=""></li>--%>
<%--        <li><img src="img/lbimg/lb_2.jpeg" alt=""></li>--%>
<%--        <li><img src="img/lbimg/lb_3.jpeg" alt=""></li>--%>
<%--        <li><img src="img/lbimg/lb_4.jpeg" alt=""></li>--%>
<%--        <li><img src="img/lbimg/lb-5.jpeg" alt=""></li>--%>
<%--    </ul>--%>
<%--    <button class=" btn_left">></button>--%>
<%--    <button class=" btn_right"><</button>--%>
<%--    <div class="item">--%>
<%--        <ul>--%>
<%--            <li class="current"></li>--%>
<%--            <li></li>--%>
<%--            <li></li>--%>
<%--            <li></li>--%>
<%--            <li></li>--%>
<%--        </ul>--%>
<%--    </div>--%>
<%--</div>--%>




<div class="layui-carousel" id="test1">
    <div carousel-item>
        <div><img src="img/lbimg/lb_2.jpeg" alt=""></div>
        <div><img src="img/lbimg/lb_3.jpeg" alt=""></div>
        <div><img src="img/lbimg/lb_4.jpeg" alt=""></div>
        <div><img src="img/lbimg/lb_1.jpeg" alt=""></div>
    </div>
</div>
<!-- 条目中可以是任意内容，如：<img src=""> -->
<script src="https://cdn.bootcdn.net/ajax/libs/layui/2.7.6/layui.js"></script>
<script>
    layui.use('carousel', function(){
        var carousel = layui.carousel;
        //建造实例
        carousel.render({
            elem: '#test1'
            ,width: 800 //设置容器宽度
            ,height: 550
            ,arrow: 'always' //始终显示箭头
            //,anim: 'updown' //切换动画方式
        });
    });
</script>

<div class="box">
    <ul class="ul1">
        <li> <img src="img/BookImg/sj6.jpeg">
            <p>此书很好,请大家购买</p>
            <div class="antour">
                <span>作者：罗贯中 |  <a href="html/Com_introduction.jsp">详情</a></span>
            </div></li>
        <li><img src="img/BookImg/sj5.jpeg">
            <p>此书很好,请大家购买</p>
            <div class="antour">
                <span>作者：笑江湖 |  <a href="#">详情</a></span>
            </div></li>
        <li><img src="img/BookImg/sj4.jpeg">
            <p>此书很好,请大家购买</p>
            <div class="antour">
                <span>作者：笑江湖 |  <a href="#">详情</a></span>
            </div></li>
        <li class="last"><img src="img/BookImg/sj3.jpeg">
            <p>此书很好,请大家购买</p>
            <div class="antour">
                <span>作者：笑江湖 |  <a href="#">详情</a></span>
            </div></li>
    </ul>


    <ul class="ul2">
        <li> <img src="img/BookImg/sj1.jpeg">
            <p>此书很好,请大家购买</p>
            <div class="antour">
                <span>作者：笑江湖 |  <a href="#">详情</a></span>
            </div></li>
        <li><img src="img/BookImg/sj2.jpeg">
            <p>此书很好,请大家购买</p>
            <div class="antour">
                <span>作者：笑江湖 |  <a href="#">详情</a></span>
            </div></li>
        <li><img src="img/BookImg/sj7.jpeg">
            <p>此书很好,请大家购买</p>
            <div class="antour">
                <span>作者：笑江湖 |  <a href="#">详情</a></span>
            </div></li>
        <li class="last"><img src="img/BookImg/sj8.jpeg">
            <p>此书很好,请大家购买</p>
            <div class="antour">
                <span>作者：笑江湖 |  <a href="#">详情</a></span>
            </div></li>
    </ul>

</div>
</body>
</html>
