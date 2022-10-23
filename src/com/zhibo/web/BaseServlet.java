package com.zhibo.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public abstract class BaseServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    // 在继承了此类的类中，一有post请求就会调用此方法
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String action=req.getParameter("action");
//        if("login".equals(action)){
//            login(req, resp);
//        }else if("regist".equals(action)){
//            regist(req, resp);
//        }
//

        //利用反射优化，防止增加功能来修改代码
        // action 的值必须与方法同名（即action就是要调用的方法）
        String action=req.getParameter("action");

        try {
              Method method=this.getClass().getDeclaredMethod(action,HttpServletRequest.class,HttpServletResponse.class);
              method.invoke(this, req,resp);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
