package com.zhibo.service.impl;

import com.zhibo.bean.Book;
import com.zhibo.dao.impl.BookDaoImpl;
import com.zhibo.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {
    BookDaoImpl bookDaoImpl = new BookDaoImpl();

    @Override
    public void addBook(Book book) {
        bookDaoImpl.addBook(book);

    }

    @Override
    public void deleteBookByName(String name) {
        bookDaoImpl.deleteBook(name);
    }

    @Override
    public void updateBook(Book book, int id) {
        bookDaoImpl.updateBook(book, id);
    }

    @Override
    public Book queryBookByName(String name) {
        return bookDaoImpl.selectBook_ByName(name);
    }

    @Override
    public List queryBooksByPrices(Double lowPrice, Double heightPrice) {
        return bookDaoImpl.selectBooks_ByPrice(lowPrice, heightPrice);
    }

    @Override
    public List queryBookAll() {
        return bookDaoImpl.selectBookAll();
    }
}
