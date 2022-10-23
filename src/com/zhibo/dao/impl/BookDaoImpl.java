package com.zhibo.dao.impl;

import com.zhibo.bean.Book;

import java.util.List;

public class BookDaoImpl extends BaseDao implements BookDao{


    @Override
    public void addBook(Book book) {
        String sql="INSERT INTO sj VALUES(null,?,?,?,?)" ;
        update(sql, book.getnName(),book.getAuthor(),book.getPrice(),book.getPublish());
    }

    @Override
    public void deleteBook(String name) {
        String sql="DELETE FROM sj WHERE nName=?";
        update(sql, name);

    }

    @Override
    public Book updateBook(Book book,int ID) {
        String sql="UPDATE sj SET nName=?,author=?,price=?,publish=?  WHERE book_id=?";
        System.out.println(update(sql, book.getnName(),book.getAuthor(),book.getPrice(),book.getPublish(),ID));
        //update(sql, book.getnName(),book.getAuthor(),book.getPrice(),book.getPublish(),ID);

        return null;
    }

    @Override
    public Book selectBook_ByName(String name) {
        String sql="SELECT * FROM sj WHERE nName=?";

        return queryForOne(Book.class, sql, name);

    }

    @Override
    public List selectBooks_ByPrice(Double lowPrice, Double heightPrice) {
        String sql = "SELECT * FROM sj WHERE price BETWEEN ? AND ?";
        return queryForList(Book.class, sql, lowPrice, heightPrice);
    }

    @Override
    public List selectBookAll() {
        String sql = "SELECT * FROM sj ";
        return queryForList(Book.class, sql);
    }
}
