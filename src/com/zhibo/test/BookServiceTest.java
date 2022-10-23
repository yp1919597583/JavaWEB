package com.zhibo.test;

import com.zhibo.bean.Book;
import com.zhibo.service.BookService;
import com.zhibo.service.impl.BookServiceImpl;
import org.junit.Test;

public class BookServiceTest {
    BookService bookService = new BookServiceImpl();
    @Test
    public void addBook() {
        bookService.addBook(new Book("as", "wq", 12.70, "电子工业"));
    }

    @Test
    public void deleteBookByName() {
        bookService.deleteBookByName("as");
    }

    @Test
    public void updateBook() {
        bookService.updateBook(new Book("as", "wq", 12.70, "电子工业"),2);
    }

    @Test
    public void queryBookByName() {
        bookService.queryBookByName("金瓶梅");
    }

    @Test
    public void queryBooksByPrices() {
        bookService.queryBooksByPrices(5.00, 100.00);
    }
}