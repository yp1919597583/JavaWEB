<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%
    String path=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";

    %>
    <base href="<%=path%>">
    <link rel="stylesheet" href="css/base.css">


    <title>Document</title>
    <style>
        div{
            width: 140px;
            height: 106px;
           text-align: center;
            margin: 150px auto;
        }
    nav{
        height: 45px;
        background: #e3e4e5;
       font-size: 12px;  
        line-height: 45px;
      
    }
    ul li a{
        color: #999;
    }
       
    </style>
</head>
<body>
    <nav><ul>
        <li><a href="index.jsp">返回首页</a></li>
        <li><a href=""></a></li>
    </ul></nav>
    <div><h1>加入我们</h1><img src="img/联系.jpg" alt=""></div>
</body>
</html>