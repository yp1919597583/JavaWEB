package com.zhibo.web;

import com.zhibo.bean.User;
import com.zhibo.service.UserService;
import com.zhibo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        UserService userService=new UserServiceImpl();
        //登录
      User user=  userService.login(new User(null, username, password));
        if (user==null){
          //登录失败
            System.out.println("登录失败!");
            resp.getWriter().write("登录失败!");
            //把错误信息和回显的信息，保存到request域
            req.setAttribute("message", "用户名或密码错误!");
            //用于回显的数据
            req.setAttribute("username", username);
            //请求转发，跳回登录页面
            req.getRequestDispatcher("html/login.jsp").forward(req, resp);
        }else {
            System.out.println("登录成功!");
            req.getRequestDispatcher("html/userinfor.jsp").forward(req, resp);

        }


    }
}
