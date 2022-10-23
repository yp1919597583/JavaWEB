package com.zhibo.web;

import com.alibaba.fastjson.JSON;
import com.zhibo.service.BookService;
import com.zhibo.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BookServlet extends BaseServlet {
    BookService bookService = new BookServiceImpl();
    protected void addBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
    protected void deleteBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
    protected void updateBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
    protected void queryList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        // 查询所有书籍保存到request域中
        List<Object> list = bookService.queryBookAll();
        // 保存到request域中
        req.setAttribute("books", list);
        // 请求转发到bookmanger页面
       // req.getRequestDispatcher("html/bookmanger.jsp");
        // 将查询数据转换成json
        String json = JSON.toJSONString(list);
       // System.out.println(json);
       // System.out.println(list);
        resp.getWriter().append(json);
    }
}
