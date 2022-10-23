package com.zhibo.test;

import com.zhibo.bean.Book;
import com.zhibo.dao.impl.BookDao;
import com.zhibo.dao.impl.BookDaoImpl;
import org.junit.Test;

public class BookDaoTest {
    BookDaoImpl bt=new BookDaoImpl();
    @Test
    public void addBook() {
        bt.addBook(new Book("金瓶梅", "兰陵笑笑生", 128.00, "清华大学出版社"));
    }

    @Test
    public void deleteBook() {
        bt.deleteBook("金瓶梅");
     //   bt.deleteBook();
    }

    @Test
    public void updateBook() {
        bt.updateBook(new Book("Linux私房菜", "鸟哥", 123.00, "电子工业出版社"), 3);
    }

    @Test
    public void selectBook_ByName() {
        BookDao bookDao=new BookDaoImpl();
        System.out.println( bookDao.selectBook_ByName("Linux私房菜").toString());

    }
    @Test
    public  void  selectBooks_ByPrice(){
        System.out.println(bt.selectBooks_ByPrice(3.00, 127.00));
    }
}