package com.zhibo.service;

import com.zhibo.bean.Book;

import java.util.List;

public interface BookService {
    // 添加书籍
    public void addBook (Book book);
    // 删除书籍
    public void deleteBookByName (String name);
    // 修改书籍信息
    public void updateBook (Book book, int id);
    // 查询书籍
    public Book queryBookByName (String name);
    // 在一个价格区间查询书籍
    public List queryBooksByPrices (Double lowPrice, Double heightPrice);
    // 查询所有书籍
    public List queryBookAll ();
}
