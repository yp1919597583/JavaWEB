package com.zhibo.web;

import com.zhibo.bean.User;
import com.zhibo.service.UserService;
import com.zhibo.service.impl.UserServiceImpl;
import com.zhibo.utils.javaBean_Utils;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY;

public class UserServlet extends BaseServlet {
    UserService userService=new UserServiceImpl();

    /**
     * 登录
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


//                   req.setCharacterEncoding("utf-8");
//            String username=req.getParameter("username");
//            String password=req.getParameter("password");
//            User user=  userService.login(new User(null, username, password));
//            if (user==null){
//
//                req.setAttribute("message", "用户名或密码错误!");
//                req.setAttribute("username", username);
//                req.getRequestDispatcher("html/login.jsp").forward(req, resp);
//            }else {
//                System.out.println("登录成功!");
//                req.getRequestDispatcher("index.jsp").forward(req, resp);
//
//        }

        // 调用javabean工具 注入Javabean

            User user = userService.login((User)javaBean_Utils.copyParamToBean(req.getParameterMap(), new User()));
            String code = (String) req.getSession().getAttribute(KAPTCHA_SESSION_KEY);
        if (user == null) {
                req.setAttribute("message", "用户名或密码错误");
                req.setAttribute("username", req.getParameter("username"));
                req.getRequestDispatcher("html/login.jsp").forward(req, resp);
                resp.getWriter().write("失败");

            }else if (!code.equals(req.getParameter("code"))){
            req.setAttribute("codeError", "验证码错误!");
            req.setAttribute("username", req.getParameter("username"));
            req.getRequestDispatcher("html/login.jsp").forward(req, resp);
        }
        else {
                System.out.println("登陆成功!");
                HttpSession session = req.getSession();
                session.removeAttribute(KAPTCHA_SESSION_KEY);
                System.out.println(session + "创建");
                session.setAttribute("username", req.getParameter("username"));
                resp.sendRedirect("html/userinfor.jsp");
            }
    }

    /**
     * 注册
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void register(HttpServletRequest req, HttpServletResponse resp) throws Exception{
      /*
       User user= javaBean_Utils.copyParamToBean(req.getParameterMap(), new User());
       String username= req.getParameter("id");
        String password=req.getParameter("password");
        String phone = req.getParameter("phone");
        String email=req.getParameter("email");
*/
      // 调用工具类就不用自己获取请求参数再注入javabean了
        User user= javaBean_Utils.copyParamToBean(req.getParameterMap(), new User());

        if(userService.existsUsername(user.getUsername())){
            req.setAttribute("regist_message", "用户名已经存在!");
            req.getRequestDispatcher("/html/register.jsp").forward(req, resp);

        }
        else if(userService.existPhonenum(user.getPhonenumber())){
            req.setAttribute("regist_message2","电话号码已经被注册");
            req.getRequestDispatcher("/html/register.jsp").forward(req, resp);
        }

        else {
            userService.registUser(new User(null, user.getUsername(),user.getPassword(),user.getEmail(), user.getPhonenumber()));

            req.getRequestDispatcher("/html/login.jsp").forward(req, resp);
        }

    }
 //   @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        String action=req.getParameter("action");
////        if("login".equals(action)){
////            login(req, resp);
////        }else if("regist".equals(action)){
////            regist(req, resp);
////        }
////
//
//    //利用反射优化，防止增加功能来修改代码
//
//        String action=req.getParameter("action");
//
//        try {
//            Method method=UserServlet.class.getDeclaredMethod(action,HttpServletRequest.class,HttpServletResponse.class);
//            method.invoke(this, req,resp);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//    }

    protected void quitLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        System.out.println(session + "销毁");
        session.invalidate();// 销毁session
        resp.sendRedirect("index.jsp");
    }
}
