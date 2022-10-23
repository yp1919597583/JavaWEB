package com.zhibo.dao.impl;

import com.zhibo.bean.Book;

import java.util.List;

public interface BookDao {
    /**
     * 添加书籍
     * @param book
     */
        public void addBook(Book book);

    /**
     * 删除书籍
     * @param book
     */
    public void deleteBook(String name);

    /**
     * 修改书籍的参数
     * @param book
     * @return 返回修改后的书籍
     */

    public Book updateBook(Book book,int ID);

    /**
     * 通过书名查询书籍
     * @param name
     * @return
     */

    public  Book selectBook_ByName(String name);

    /**
     *
     * @param heightPrice lowPrice
     * @return 查询到价格在此区间的书籍
     */
    public List selectBooks_ByPrice(Double lowPrice, Double heightPrice);

    /**
     * 获取所有的书籍信息
     * @return
     */
    public List selectBookAll();
}
