package com.zhibo.web;

import com.zhibo.bean.User;
import com.zhibo.service.UserService;
import com.zhibo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistServlet extends HttpServlet {
    //由于web层不能直接调用dao，只能调用service 层所以需要一个userservice
    private UserService userService=new UserServiceImpl();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //获取请求参数
        String username= req.getParameter("id");
        String password=req.getParameter("password");
        String phone = req.getParameter("phone");
        String email=req.getParameter("email");
        //获取验证码
     //   String code=req.getParameter("code");
        //检查验证码
      //  if ("abcde".equalsIgnoreCase(code)){

            //检查用户名是否可以使用
            if(userService.existsUsername(username)){
               // System.out.println("用户名"+username+"已注册!");
                req.setAttribute("regist_message", "用户名已经存在!");
                //跳回注册页面
                req.getRequestDispatcher("/html/register.jsp").forward(req, resp);

            }
            else if(userService.existPhonenum(phone)){
                req.setAttribute("regist_message2","电话号码已经被注册");
                req.getRequestDispatcher("/html/register.jsp").forward(req, resp);
            }

            else {
                //可用
                userService.registUser(new User(null, username, password, email,phone));

                req.getRequestDispatcher("/html/login.jsp").forward(req, resp);
            }

        }
        //else {
//            req.getRequestDispatcher("/html/register.jsp").forward(req, resp);//跳回注册页面
//            System.out.println("验证码错误!");
//        }


    }
//}
