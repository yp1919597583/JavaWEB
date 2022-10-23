<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录</title>
    <%
        //动态获取服务器地址
        String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";

    %>
    <base href="<%=basePath%>">

    <style>
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        .w{
            position: relative;
            background-color: rgb(201, 188, 188);
            height: 800px;
            margin: 100px;
            min-width: 1050px;
        }
        a{
            text-decoration: none;
            color: black;
            margin-right: 5px;
        }
        a:hover{
            
            color: #FF0000;
           
        }
        i{
            position: absolute;
            top: 400px;
            left: 20%;
            font-size: 80px;
            text-shadow: 5px 5px 5px #FF0000;

        }
        .login{
            position: absolute;
            transition: 0.3s;
            right: 10px;
            top: 50px;
            width: 300px;
            height: 520px;
            background-color: #fff;
           

        }
        .login:hover{
            box-shadow: 10px 10px 5px #888888;
            transition: 0.3s;
        }
        form{
            display: block;
            height: 480px;
            margin: 10px;
            
            /* background-color: hsl(0, 100%, 50%); */
        }
        img{
            vertical-align: middle;
        }
        input{
           border: 1px solid #eecc0e;
            height: 45px;
           margin-top: 30px;
            margin-left: 20px;

           color: rgba(36, 34, 34, 0.294);
        }
        input[type='submit']{
            display: block;
            width: 205px;
            margin: 20px auto;
            border-radius: 20px;
            border: 0px;
            background-color: rgb(240, 131, 43);
            color: #fff;
        }
      h2{
          text-align: center;
      }
      .login-line{
        position: absolute;
        bottom: 10px;  
        width: 300px;
        

      }
      ul li{
          color: rgba(155, 151, 151, 0.931);
          display: block;
          width: 100%;
          list-style: none;
          text-align: center;
          margin: 10px 0px;
          font-size: 10px;
      }
     
      .btn:active{
          background-color: rgb(230, 32, 32);
         
      }
      input{
          outline: none;
      }
      .focus:focus{
       border: 2px #FF0000 solid;
      }
      .password:focus{
        border: 2px #FF0000 solid;
      }
        .hind_ts{
            position: absolute;

            left: 45px;
        }
    </style>

</head>
<body>
    <div class="w">
        <img src="img/gif/hmbb.gif">
        <i>欢迎登录</i>
        <div class="login">
        <form action="userServlet" method="post">
            <input type="hidden" name="action" value="login">
            <h2>智博二手书登录</h2>
            <div style="color: #FF0000; display: block;" class="hind_ts">${requestScope.message==null?requestScope.get("codeError"):requestScope.get("message")}</div>
            <div class="user"> <img src="img/icoimg/user.png" alt=""><input type="text" placeholder="手机号/邮箱" class="focus" name="username" value="${requestScope.username == null?"13131":requestScope.username}"></div>
            <div class="password"> <img src="img/icoimg/password.png" alt=""><input type="password" class="password" name="password" value="Qewewe"></div>
            <div class="user"> <label>验证码</label><input type="text" class="password" style="width: 70px;margin-left: 10px" name="code"><img class="captcha" src="kaptcha.jpg" style="width: 100px;height: 20px;"></div>

            <input type="submit" value="登录" class="btn">
            <ul>
                <li>作者@杨鹏</li>
                <li>zhibo.com版权所有</li>
                <li>发布时间2021</li>
            </ul>
            <div class="login-line">
                <a href="javascript:;">忘记密码</a><a href="#">忘记账户</a><a href="html/register.jsp">免费注册</a>
            </div>
        </form>
        </div>
    </div>
    <script>
        var input=document.querySelector('.focus');
        var submit=document.querySelector('.btn');
       
        input.onfocus=function(){
           if (this.value=='手机号/邮箱') {
            this.value='';
            this.style.color='#1a1819';
            
           }
            
        }
        input.onblur=function(){
            if (this.value=='') {
                this.value='手机号/邮箱';
                this.style.color='rgba(155, 151, 151, 0.931)';
            }
        }
    </script>
</body>
<script>
    document.querySelector(".captcha").addEventListener('click',function () {
        this.src ="<%=basePath%>kaptcha.jpg?x=" + new Date();
    })
</script>
</html>