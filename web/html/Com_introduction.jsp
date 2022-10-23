<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%
        //动态获取服务器地址
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";

    %>
    <base href="<%=basePath%>">
    <link rel="stylesheet" href="css/Com_introduction.css">

    <link rel="stylesheet" href="css/index.css">
    <link rel="shortcut icon" href="img/favicon.ico"  type="image/x-icon">
    <link rel="stylesheet" href="css/base.css">
    <script src="js/jquery.js"></script>
    <script src="js/Com_introduction.js"></script>
    <script src="js/Countdown.js"></script>
    <title>三国演义白话本--53元起!</title>

</head>
<body>
<%--静态包含导航栏--%>
<%@include file="../common/nav_nom.jsp"%>

<div class="sp_img">
    <img src="./img/spimg/sgyy.jpeg" alt="">
</div>
<div class="introduction">
    <h3>三国演义</h3>
    <span>《三国演义》（全名为《三国志通俗演义》，又称《三国志演义》）是元末明初小说家罗贯中根据陈寿《三国志》和裴松之注解以及民间三国故事传说经过艺术加工创作而成的长篇章回体历史演义小说，与《西游记》《水浒传》《红楼梦》并称为中国古典四大名著。该作品成书后有嘉靖壬午本等多个版本传于世，到了明末清初，毛宗岗对《三国演义》整顿回目、修正文辞、改换诗文，
        该版本也成为诸多版本中水平最高、流传最广的版本。</span>
</div>
    <div class="add_pay">
        <span>限时特惠2件打6折,周六秒杀特辑,人人都能读名著</span>
       <div class="js">
           <p>限时秒杀</p>
           <div class="time_ground">12:00场</div>
           <span class="djs_span" style="  color: #fff; font-size: 16px;font-weight: 500;">本场剩余时间:</span>

            <div class="Countdown">
                <span></span><span></span><span></span>
            </div>
           <div class="pay">
            <div class="add_car">
                <span class="pay_js">可用优惠券暂无</span>
                <div class="ms_many"><span>零售价:</span><i>￥ 54</i>
                
                </div>
                <button class="sub_btn">-</button>
                <input type="text" value="1" class="inp"><button class="add_btn">+</button>
                <button class="addto_car">加入购物车</button>
            </div>

           </div>
       </div>
    </div>

<div class="review">
    <span class="ly">商品介绍</span>
    <div class="a"> <a href="javascript:;" class="a_current">商品简介</a><a href="javascript:;">商品规格</a><a href="javascript:;">售后保障</a><a href="javascript:;">评论</a></div>
    <div class="xq">
        <ul>
            <li>三国演义</li>
            <li>309页</li>
            <li>7天无理由退款</li>
            <li>
                <textarea name="" id="" cols="30" rows="10" style="resize: none;"></textarea>
                <button class="issue">发布</button>
                <ol class="ly_nr">
                    <li>qwqwq</li>
                </ol>
               
            </li>
        </ul>
    </div>
</div>
</body>
</html>